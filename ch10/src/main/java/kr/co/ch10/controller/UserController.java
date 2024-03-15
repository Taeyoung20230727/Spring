package kr.co.ch10.controller;


import kr.co.ch10.dto.UserDTO;
import kr.co.ch10.entity.User;
import kr.co.ch10.jwt.JwtProvider;
import kr.co.ch10.security.MyUserDetails;
import kr.co.ch10.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@Slf4j
@RequiredArgsConstructor
public class UserController {

        private final AuthenticationManager authenticationManager;
        private final JwtProvider jwtProvider;
        private final UserService service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDTO userDTO){

        log.info("Login2..." + userDTO.toString());
        
        try {
            // security 인증 처리
            UsernamePasswordAuthenticationToken authToken
                    = new UsernamePasswordAuthenticationToken(userDTO.getUid(), userDTO.getPass());

            // 사용자 DB 조회
            Authentication authentication = authenticationManager.authenticate(authToken);
            log.info("login...2");

            // 인증된 사용자 가져오기
            MyUserDetails userDetails = (MyUserDetails) authentication.getPrincipal();
            User user = userDetails.getUser();

            // 토큰 발급(엑세스, 리프레쉬)
            String access = jwtProvider.createToken(user, 1);   // 1일
            String refresh = jwtProvider.createToken(user, 7);  // 7일

            // 리프레시 토큰 DB저장

            // 엑세스 토큰 클라이언트 전송
            Map<String, Object> map = new HashMap<>();
            map.put("grantType", "Bearer");
            map.put("access", access);

            return ResponseEntity.ok().body(map);

        }catch (Exception e){
            log.info("login...3" + e.getMessage());
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not found");
        }

    }

    @PreAuthorize("hasRole('USER') or hasRole('MANAGER') or hasRole('ADMIN')")
    @GetMapping("/user")
    public ResponseEntity<List<UserDTO>> list(){

        return service.selectUsers();



    }

}
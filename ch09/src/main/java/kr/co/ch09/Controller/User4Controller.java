package kr.co.ch09.Controller;


import kr.co.ch09.dto.User4DTO;
import kr.co.ch09.service.User4Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class User4Controller {

    private final User4Service user4Service;

    @GetMapping("/user4")
    public ResponseEntity<List<User4DTO>> list(){
        log.info("User4Controller/list");
        return user4Service.selectUser4s();
    }

    @GetMapping("/user4/{uid}")
    public ResponseEntity<?> user4(@PathVariable("uid") String uid){
        log.info("User4Controller/user4");
        return user4Service.selectUser4(uid);
    }

    @PostMapping("/user4")
    public ResponseEntity<?> register(@RequestBody User4DTO user4DTO){
        log.info("User4Controller/register");
        return user4Service.insertUser4(user4DTO);
    }

    @PutMapping("/user4")
    public ResponseEntity<?> modify(@RequestBody User4DTO user4DTO){
        log.info("User4Controller/modify");
        return user4Service.updateUser4(user4DTO);
    }

    @DeleteMapping("/user4/{uid}")
    public ResponseEntity<?> delete(@PathVariable("uid") String uid){
        log.info("User4Controller/modify");
        return user4Service.deleteUser4(uid);
    }

}

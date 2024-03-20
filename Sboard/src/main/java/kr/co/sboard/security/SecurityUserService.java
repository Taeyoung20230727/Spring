package kr.co.ch10.sboard.security;

import kr.co.ch10.sboard.entity.User;
import kr.co.ch10.sboard.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class SecurityUserService implements UserDetailsService {

    private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> result =  userRepository.findById(username);

        UserDetails userDetails = null;

        if(!result.isEmpty()){

            // 해당하는 사용자가 존재하면 인증객체 생성
            userDetails = MyUserDetails.builder().user(result.get()).build();
        }
        // Security ContextHolder 저장
        return userDetails;
    }
}

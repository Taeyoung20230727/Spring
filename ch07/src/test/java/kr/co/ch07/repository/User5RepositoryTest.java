package kr.co.ch07.repository;


import kr.co.ch07.entity.User5;
import kr.co.ch07.repository.board.service.repository.User5Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@Slf4j
@SpringBootTest
public class User5RepositoryTest {
    
    @Autowired
    private User5Repository repository;
    
    
    @Test
    @DisplayName("user5 등록")
    public void insertUser5(){
        User5 user5 = User5.builder()
                .name("공명")
                .gender("M")
                .age(55)
                .addr("촉")
                .build();

        repository.save(user5);
    }

    @Test
    @DisplayName("user5 조회")
    public void selectUser5(){
        int seq = 1;

        Optional<User5> result = repository.findById(seq);
        User5 user5 = result.get();
    }

    @Test
    @DisplayName("")
    public void selectUser5s(){}

    @Test
    @DisplayName("")
    public void updateUser5(){}

    @Test
    @DisplayName("")
    public void deleteUser5(){}
    
}

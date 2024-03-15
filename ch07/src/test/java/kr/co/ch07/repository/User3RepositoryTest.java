package kr.co.ch07.repository;


import kr.co.ch07.entity.User3;
import kr.co.ch07.repository.board.service.repository.User3Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@Slf4j
@SpringBootTest
public class User3RepositoryTest {

    @Autowired
    private User3Repository repository;

    @Test
    @DisplayName("user3 등록")
    public void insertUser3(){
        User3 user3 = User3.builder()
                .uid("A103")
                .name("포도")
                .birth("1974-02-21")
                .hp("010-1212-4541")
                .addr("광주")
                .build();

        repository.save(user3);
    }

    @Test
    @DisplayName("user3 조회")
    public void selectUser3(){
        String uid = "A101";

        Optional<User3> result = repository.findById(uid);
        User3 user3 = result.get();
        
    }

    @Test
    @DisplayName("user3 목록")
    public void selectUser3s(){}

    @Test
    @DisplayName("user3 수정")
    public void updateUser3(){}

    @Test
    @DisplayName("user3 삭제")
    public void deleteUser3(){}


}

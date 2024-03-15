package kr.co.ch07.repository;


import kr.co.ch07.entity.User4;
import kr.co.ch07.repository.board.service.repository.User4Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@Slf4j
@SpringBootTest
public class User4RepositoryTest {

    @Autowired
    private User4Repository repository;

    @Test
    @DisplayName("user4 등록")
    public void insertUser4() {
        User4 user4 = User4.builder()
                .uid("A104")
                .name("바밤바")
                .gender("F")
                .age(31)
                .hp("010-3535-8585")
                .addr("충주")
                .build();

        repository.save(user4);
    }

    @Test
    @DisplayName("user4 조회")
    public void selectUser4() {
        String uid = "A101";

        Optional<User4> result = repository.findById(uid);
        User4 user4 = result.get();
    }

    @Test
    @DisplayName("user4 목록")
    public void selectUser4s() {}

    @Test
    @DisplayName("user4 수정")
    public void updateUser4() {}

    @Test
    @DisplayName("user4 삭제")
    public void deleteUser4() {}


}
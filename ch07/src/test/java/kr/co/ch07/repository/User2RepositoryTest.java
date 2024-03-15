package kr.co.ch07.repository;

import kr.co.ch07.entity.User2;
import kr.co.ch07.repository.board.service.repository.User2Repository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@Slf4j
@SpringBootTest
public class User2RepositoryTest {

    @Autowired
    private User2Repository repository;

    @Test
    @DisplayName("user2 등록")
    public void insertUser2(){
        // given - Entity 준비
        User2 user2 = User2.builder()
                .uid("A101")
                .name("사이다")
                .birth("1997-01-18")
                .addr("울주")
                .build();

        // when - entity 저장
        repository.save(user2);
    }

    @Test
    @DisplayName("user2 조회")
    public void selectUser2(){
        // given - 조회아이디
        String uid = "A102";

        // when - 조회하기
        Optional<User2> result = repository.findById(uid);
        User2 user2 = result.get();

    }

    @DisplayName("user2 목록")
    public void selectUser2s(){}

    @DisplayName("user2 수정")
    public void updateUser2(){}

    @DisplayName("user2 삭제")
    public void deleteUser2(){}

}

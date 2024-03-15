package kr.co.ch06.Mapper;


import kr.co.ch06.DTO.User1DTO;
import kr.co.ch06.DTO.User2DTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
public class User2MapperTest {

    @Autowired
    private User2Mapper mapper;

    @Test
    @DisplayName("user2 등록")
    void insertUser2() {
        log.info("insertUser2...");

        // given
        User2DTO user2DTO = User2DTO.builder()
                .uid("j103")
                .name("숟 가락")
                .birth("1945-12-14")
                .addr("속초")
                .build();
        // when
        mapper.insertUser2(user2DTO);

        // then
        User2DTO resultUser2 = mapper.selectUser2(user2DTO.getUid());
        assertEquals(user2DTO.getUid(), resultUser2.getUid());

    }

    @Test
    @DisplayName("user2 조회")
    void selectUser2() {
        log.info("selectUser2...");

        // given
        String uid = "A106";

        // when
        User2DTO user2DTO = mapper.selectUser2(uid);
        log.info(user2DTO.toString());

        // then
        assertEquals(uid, user2DTO.getUid());
    }

    @Test
    @DisplayName("user2 목록")
    void selectUser2s() {
        log.info("selectUser2s...");

        // given
        List<User2DTO> users = null;

        // when
        users = mapper.selectUser2s();
        for(User2DTO user : users){
            log.info(user.toString());
        }

        // then
        assertFalse(users.isEmpty());

    }

    @Test
    @DisplayName("user2 수정")
    void updateUser2() {
        log.info("updateUser2...");

        // given
        User2DTO user2DTO = User2DTO.builder()
                .uid("A102")
                .name("젓가락")
                .birth("1976-05-21")
                .addr("충북 괴산")
                .build();

        // when
        mapper.updateUser2(user2DTO);


        // then
        User2DTO resultUser2 = mapper.selectUser2(user2DTO.getUid());
        assertEquals(user2DTO.getName(), resultUser2.getName());

    }

    @Test
    @DisplayName("user2 삭제")
    void deleteUser2() {
        log.info("deleteUser2...");

        // given
        String uid = "A105";

        // when
        mapper.deleteUser2(uid);

        // then
        User2DTO resultUser2 = mapper.selectUser2(uid);
        assertNull(resultUser2);
    }
}

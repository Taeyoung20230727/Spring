package kr.co.ch06.Mapper;

import kr.co.ch06.DTO.User5DTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
public class User5MapperTest {

    @Autowired
    private User5Mapper mapper;

    @Test
    @DisplayName("user5 등록")
    void insertUser5(){
        log.info("insertUser5...");

        User5DTO user5DTO = User5DTO.builder()

                .name("조조")
                .gender("M")
                .age(55)
                .addr("위")
                .build();

        mapper.insertUser5(user5DTO);

        User5DTO resultUser5 = mapper.selectUser5(user5DTO.getSeq());
        assertEquals(user5DTO.getSeq(), resultUser5.getSeq());

    }

    @Test
    @DisplayName("User5 조회")
    void selectUser5(){
        log.info("selectUser5");

        String seq="1";

        User5DTO user5DTO = mapper.selectUser5(seq);
        log.info(user5DTO.toString());

        assertEquals(seq, user5DTO.getSeq());
    }

    @Test
    @DisplayName("User5 목록")
    void selectUser5s(){
        log.info("selectUser5s");

        List<User5DTO> users = null;

        users = mapper.selectUser5s();
        for(User5DTO user : users){
            log.info(user.toString());
        }

        assertFalse(users.isEmpty());
    }

    @Test
    @DisplayName("User5 수정")
    void updateUser5(){
        log.info("updateUser5...");

        User5DTO user5DTO = User5DTO.builder()
                .seq("2")
                .name("관공")
                .gender("M")
                .age(60)
                .addr("촉")
                .build();

        mapper.updateUser5(user5DTO);

        User5DTO resultUser5 = mapper.selectUser5(user5DTO.getSeq());
        assertEquals(user5DTO.getSeq(), resultUser5.getSeq());

    }

    @Test
    @DisplayName("User5 삭제")
    void deleteUser5(){
        log.info("deleteUser5");

        String seq = "3";

        mapper.deleteUser5(seq);

        User5DTO resultUser5 = mapper.selectUser5(seq);
        assertNull(resultUser5);

    }

}

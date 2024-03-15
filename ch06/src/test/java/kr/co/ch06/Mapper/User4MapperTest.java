package kr.co.ch06.Mapper;


import kr.co.ch06.DTO.User4DTO;
import kr.co.ch06.Mapper.User4Mapper;
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
public class User4MapperTest {

    @Autowired
    private User4Mapper mapper;

    @Test
    @DisplayName("user4 등록")
    void insertUser4(){
        log.info("insertUser4...");

        User4DTO user4DTO = User4DTO.builder()
                .uid("A105")
                .name("사이다")
                .gender("F")
                .age("25")
                .hp("010-2421-5124")
                .addr("창원")
                .build();

        mapper.insertUser4(user4DTO);

        User4DTO resultUser4 = mapper.selectUser4(user4DTO.getUid());
        assertEquals(user4DTO.getUid(), resultUser4.getUid());
    }

    @Test
    @DisplayName("User4 조회")
    void selectUser4(){
        log.info("selectUser4");

        String uid="A102";

        User4DTO user4DTO = mapper.selectUser4(uid);
        log.info(user4DTO.toString());

        assertEquals(uid, user4DTO.getUid());
    }

    @Test
    @DisplayName("user4 목록")
    void selectUser4s(){
        log.info("selectUser4s");

        List<User4DTO> users = null;

        users = mapper.selectUser4s();
        for(User4DTO user : users){
            log.info(user.toString());
        }

        assertFalse(users.isEmpty());

    }

    @Test
    @DisplayName("User4 수정")
    void updateUser4(){
        log.info("updateUser4...");

        User4DTO user4DTO = User4DTO.builder()
                .uid("A102")
                .name("갈매기")
                .gender("M")
                .age("24")
                .hp("010-1234-2211")
                .addr("서울시 강남구")
                .build();

        mapper.updateUser4(user4DTO);

        User4DTO resultUser4 = mapper.selectUser4(user4DTO.getUid());
        assertEquals(user4DTO.getUid(), resultUser4.getUid());
    }

    @Test
    @DisplayName("user4 삭제")
    void deleteUser4(){
        log.info("deleteUser4");

        String uid = "A104";

        mapper.deleteUser4(uid);

        User4DTO resultUser4 = mapper.selectUser4(uid);
        assertNull(resultUser4);
    }



}

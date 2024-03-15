package kr.co.ch09.dto;

import jakarta.validation.constraints.*;
import kr.co.ch09.entity.User2;
import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User2DTO {

    /*
         - REST API 서비스 특성상 프로트엔드에서 유효성 검사를 진행하기 어려움
         - @Validate, @NotBlank, @NotEmpty 백엔드에서 유효성 검사를 진행
     */

    @NotBlank   // null, "", " " 모두 허용 안함
    private String uid;

    @NotEmpty   // null, "" 허용 안함
    private String name;

    @NotNull    // null 허용 안함
    private String birth;

    @Email      // email 형식 검증
    private String email;
    
    @Min(1)
    @Max(100)
    private int age;

    private String addr;

    public User2 toEntity(){
        return User2.builder()
                .uid(uid)
                .name(name)
                .birth(birth)
                .email(email)
                .age(age)
                .addr(addr)
                .build();
    }


}

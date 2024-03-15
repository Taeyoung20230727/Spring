package kr.co.ch06.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User5DTO {
    private String seq;
    private String name;
    private String gender;
    private int age;
    private String addr;
}

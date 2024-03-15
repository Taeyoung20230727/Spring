package kr.co.ch06.DTO;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User1DTO {
    private String uid;
    private String name;
    private String hp;
    private int age;

}

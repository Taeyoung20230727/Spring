package kr.co.ch06.DTO;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User4DTO {
    private String uid;
    private String name;
    private String gender;
    private String age;
    private String hp;
    private String addr;
}

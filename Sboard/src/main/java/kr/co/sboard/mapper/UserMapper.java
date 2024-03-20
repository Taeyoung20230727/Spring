package kr.co.sboard.mapper;

import kr.co.sboard.dto.TermsDTO;

@mapper
public class UserMapper {

    public TermsDTO selectTermsUser();
    public void insertUser();
    public void selectUser();
    public void selectUsers();
    public void updateUser();
    public void deleteUser();
}

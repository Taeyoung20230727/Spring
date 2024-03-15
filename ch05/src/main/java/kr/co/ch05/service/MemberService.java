package kr.co.ch05.service;

import kr.co.ch05.dto.ParentDTO;
import kr.co.ch05.dto.memberDTO;
import kr.co.ch05.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberMapper mapper;

    public MemberService(MemberMapper mapper) {
        this.mapper = mapper;
    }

    public void insertMember(memberDTO memberDTO){
        mapper.insertmember(memberDTO);
    }
    public memberDTO selectMember(String uid){
        return mapper.selectmember(uid);
    }
    public List<memberDTO> selectMembers(){
        return mapper.selectmembers();
    }
    public List<memberDTO> selectMembersForSearch(String type, String value, String[] pos){
        return mapper.selectmembersForSearch(type, value, pos);
    }
     public List<ParentDTO> selectParentWithChild(){
            return mapper.selectParentWithChild();
        }
    public void updateMember(memberDTO memberDTO){
        mapper.updatemember(memberDTO);
    }
    public void deleteMember(String uid){
        mapper.deletemember(uid);
    }

}

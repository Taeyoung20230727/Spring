package kr.co.ch05.mapper;

import kr.co.ch05.dto.ParentDTO;
import kr.co.ch05.dto.memberDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MemberMapper {
    public void insertmember(memberDTO memberDTO);
    public memberDTO selectmember(String uid);
    public List<memberDTO> selectmembers();
    public List<memberDTO> selectmembersForSearch(@Param("type") String type,
                                                  @Param("value") String value,
                                                  @Param("pos") String[] pos);

    public List<ParentDTO> selectParentWithChild();

    public void updatemember(memberDTO memberDTO);
    public void deletemember(String uid);

}

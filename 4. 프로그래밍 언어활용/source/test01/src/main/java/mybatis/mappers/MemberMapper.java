package mybatis.mappers;

import members.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MemberMapper {
    List<Member> list();

    @Select("SELECT * FROM MEMBER WHERE USER_ID=#{userId}")
    Member getList(String userId);

    int insert(Member member);

    List<Member> getLists(String userNm);
}

package mappers.member;

import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
    @Select("SELECT COUNT(*) FROM MEMBER")
    long getTotal();
}

package org.choongang.member.repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findByEmail(String email);
    Page<Member> findByUserNameContaining(String keyword, Pageable pageable);
    List<Member> findByUserNameContainingAndEmailContainingOrderByRegDtDesc(String key1, String key2);

    @Query("SELECT * FROM MEMBER WHERE USER_NAME LIKE :param1 AND EMAIL LIKE :param2 ORDER BY REG_DT DESC")
    List<Member> getMembers(@Param("param1") String key1, @Param("param2") String key2);
}

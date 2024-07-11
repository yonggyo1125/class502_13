package org.choongang.member.repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findByEmail(String email);
    List<Member> findByUserNameContaining(String keyword);
    List<Member> findByUserNameContainingAndEmailContainingOrderByRegDtDesc(String key1, String key2);
}

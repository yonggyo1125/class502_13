package org.choongang.member.repositories;

import org.choongang.member.entities.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findByEmail(String email);
}

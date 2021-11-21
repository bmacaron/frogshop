package com.frogshop;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.frogshop.domain.Member;

@Repository
public class MemberRepository {

	@PersistenceContext
	private EntityManager em;
	
	//Member persistenceContext에 엔티티 객체 저장
	public Long save(Member member) {
		em.persist(member);
		return member.getId();
	}
	
	//Member 조회
	public Member find(Long id) {
		return em.find(Member.class, id);
	}
}

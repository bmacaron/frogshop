package com.frogshop.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frogshop.domain.Member;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

	//@PersistenceContext
	//@Autowired
	private final EntityManager em;

	public void save(Member member) {
		em.persist(member);
	}
	
	public Member findOne(Long id) {
		return em.find(Member.class, id);
	}
	
	//검색할 쿼리, 반환타입, 반환타입 Member를 List로 리턴해줌
	public List<Member> findAll() {
		return em.createQuery("select m from Member m", Member.class)
				.getResultList();
	}
	
	//이름을 검색해서 회원찾기
	public List<Member> findByName(String name) {
		return em.createQuery("select m from Member m where m.name = :name", Member.class)
				.setParameter("name", name)
				.getResultList();
	}
}

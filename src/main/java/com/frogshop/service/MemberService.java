package com.frogshop.service;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.frogshop.domain.Member;
import com.frogshop.repository.MemberRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

	//@Autowired
	private final MemberRepository memberRepository;

	//회원 가입
	@Transactional
	public Long join(Member member) {
		//중복회원 검증
		validateDuplicateMember(member);
		memberRepository.save(member);
		return member.getId();
	}
	//회원 전체 조회
	public List<Member> findMembers() {
		return memberRepository.findAll();
	}
	
	//회원 단건 조회
	public Member findOne(Long memberId) {
		return memberRepository.findOne(memberId);
	}

	//중복회원 검증 메서드
	private void validateDuplicateMember(Member member){
		List<Member> findMembers = memberRepository.findByName(member.getName());
		
		if(!findMembers.isEmpty()) {
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		}
	}
	
}

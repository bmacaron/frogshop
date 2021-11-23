package com.frogshop;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.frogshop.domain.Member;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberRepositoryTest {

	
//	@Autowired MemberRepository memberRepository;
//
//	@Test
//	@Transactional
//	@Rollback(false)
//	public void testMember() throws Exception {
//		//given =>test케이스 작성
//		Member member = new Member();
//		member.setName("A");
//		//when
//		Long savedId = memberRepository.save(member);
//		Member findMember = memberRepository.find(savedId);
//
//		//then => 검증
//		Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//		Assertions.assertThat(findMember.getName()).isEqualTo(member.getName());
//		//같다, 트랜잭션으로 되어있기 때문에 같은 영속성 컨텍스트에서 식별자가 같은 id로 조회되기때문에 같다고 인식한다.
//		Assertions.assertThat(findMember).isEqualTo(member);
//	}
}

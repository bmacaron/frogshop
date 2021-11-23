package com.frogshop.service;

import com.frogshop.domain.Member;
import com.frogshop.repository.MemberRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;
    //@Autowired
    //EntityManager em;

    @Test
    //@Rollback(false)
    public void 회원가입() throws Exception {
        //given ~주어졌을때
        Member member = new Member();
        member.setName("kim");

        //when ~실행하면
        Long saveId = memberService.join(member);

        //then ~이다.
        //em.flush();, insert문 들어가는거 보고싶을경우
        assertEquals(member, memberRepository.findOne(saveId));
    }

    @Test
    public void 중복_회원_예외() throws Exception {
        //given

        //when

        //then
    }
}
package com.example.gulimall.order;

import com.example.gulimall.order.entity.MemberEntity;
import com.example.gulimall.order.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

	@Autowired
	MemberService memberService;
	@Test
	void contextLoads() {
		MemberEntity memberEntity = new MemberEntity();
		memberEntity.setNickname("slowsail");
		memberService.save(memberEntity);
	}

}

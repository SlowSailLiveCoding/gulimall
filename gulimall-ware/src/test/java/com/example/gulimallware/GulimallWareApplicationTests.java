package com.example.gulimallware;

import com.example.gulimall.ware.entity.OmsOrderEntity;
import com.example.gulimall.ware.service.OmsOrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

	@Autowired
	OmsOrderService omsOrderService;
	@Test
	void contextLoads() {
	 OmsOrderEntity omsOrder=new OmsOrderEntity();
		omsOrder.setOrderSn("123456");
		omsOrderService.save(omsOrder);
	}

}

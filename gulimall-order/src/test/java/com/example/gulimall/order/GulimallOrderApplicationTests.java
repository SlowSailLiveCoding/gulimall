package com.example.gulimall.order;

import com.example.gulimall.order.entity.OrderEntity;
import com.example.gulimall.order.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallOrderApplicationTests {

	@Autowired
	OrderService orderService;
	@Test
	void contextLoads() {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setOrderSn("123456");
		orderService.save(orderEntity);
	}

}

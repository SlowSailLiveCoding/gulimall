package com.example.gulimall.coupon;

import com.example.gulimall.coupon.entity.CouponEntity;
import com.example.gulimall.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallCouponApplicationTests {

	@Autowired
	CouponService couponService;
	@Test
	void contextLoads() {
		CouponEntity couponEntity = new CouponEntity();
		couponEntity.setCouponName("满100减10");
		couponService.save(couponEntity);
		System.out.println("保存成功");
	}

}

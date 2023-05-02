package com.example.gulimall.order.dao;

import com.example.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author slowsail
 * @email droy98781@gmail.com
 * @date 2023-05-02 10:18:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

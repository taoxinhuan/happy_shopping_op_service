package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.OrderQuery;
import com.happy.service.main.po.Order;

public interface OrderMapper {
	/**
	 * @description:新增订单
	 * @param order
	 * @return
	 * @return int
	 */
	void insertOrder(@Param("order") Order order);
	
	/**
	 * @description:支付订单
	 * @param orderId
	 * @return void
	 */
	void payForOrder(@Param("orderId") Long orderId);
	
	/**
	 * @description:取消订单
	 * @param orderId
	 * @return void
	 */
	void dropOrder(@Param("orderId") Long orderId);
	
	/**
	 * @description :分页查询订单
	 * @param query
	 * @return
	 * @return Page<Order>
	 */
	Page<Order> listOrder(@Param("query") OrderQuery query);
}

package com.happy.service.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.OrderItemQuery;
import com.happy.service.main.po.OrderItem;

public interface OrderItemMapper {
	/**
	 * @description :插入单条订单项
	 * @param orderItem
	 * @return void
	 */
	void insertOrderItem(@Param("po") OrderItem po);
	
	/**
	 * @description:批量插入订单项
	 * @param srderItems
	 * @return void
	 */
	void insertOrderItems(@Param("orderItems") List<OrderItem> orderItems);
	
	/**
	 * @description:分页查询订单项
	 * @param query
	 * @return
	 * @return Page<OrderItem>
	 */
	Page<OrderItem> listOrderItem(@Param("query") OrderItemQuery query);
}

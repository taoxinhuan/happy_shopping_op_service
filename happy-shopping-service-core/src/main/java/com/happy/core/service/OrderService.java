/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import com.happy.core.dto.OrderDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.OrderQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:21:11
 */
public interface OrderService {
	/**
	 * @description:新增订单
	 * @param dto
	 * @return
	 * @return int
	 */
	void insertOrder(OrderDTO dto);
	
	/**
	 * @description:支付订单
	 * @param orderId
	 * @return void
	 */
	void payForOrder(Long orderId);
	
	/**
	 * @description:取消订单
	 * @param orderId
	 * @return void
	 */
	void dropOrder(Long orderId);
	
	/**
	 * @description :分页查询订单
	 * @param query
	 * @return
	 * @return Page<Order>
	 */
	PageList<OrderDTO> listOrder(OrderQuery query);
}

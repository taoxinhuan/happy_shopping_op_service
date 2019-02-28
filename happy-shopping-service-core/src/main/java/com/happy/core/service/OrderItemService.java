/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import java.util.List;

import com.happy.core.dto.OrderItemDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.OrderItemQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:21:22
 */
public interface OrderItemService {
	/**
	 * @description :插入单条订单项
	 * @param dto
	 * @return void
	 */
	void insertOrderItem(OrderItemDTO dto);
	
	/**
	 * @description:批量插入订单项
	 * @param dtoList
	 * @return void
	 */
	void insertOrderItems(List<OrderItemDTO> dtoList);
	
	/**
	 * @description:分页查询订单项
	 * @param query
	 * @return
	 * @return Page<OrderItemDTO>
	 */
	PageList<OrderItemDTO> listOrderItem(OrderItemQuery query);
}

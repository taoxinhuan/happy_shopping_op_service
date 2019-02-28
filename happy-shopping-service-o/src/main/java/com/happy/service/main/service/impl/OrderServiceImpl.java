/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.OrderDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.OrderQuery;
import com.happy.core.service.OrderService;
import com.happy.service.main.bl.OrderBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午1:12:44
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderBL orderBL;
	
	@Override
	public void insertOrder(OrderDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		orderBL.insertOrder(dto);
	}
	
	@Override
	public void payForOrder(Long orderId) {
		AssertUtils.notNull(orderId, "传入订单ID不能为空");
		orderBL.payForOrder(orderId);
	}
	
	@Override
	public void dropOrder(Long orderId) {
		AssertUtils.notNull(orderId, "传入订单ID不能为空");
		orderBL.dropOrder(orderId);
	}
	
	@Override
	public PageList<OrderDTO> listOrder(OrderQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return orderBL.listOrder(query);
	}
}

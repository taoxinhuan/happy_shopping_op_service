/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.OrderItemDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.OrderItemQuery;
import com.happy.core.service.OrderItemService;
import com.happy.service.main.bl.OrderItemBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午1:11:44
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {
	@Autowired
	private OrderItemBL orderItemBL;
	
	@Override
	public void insertOrderItem(OrderItemDTO dto) {
		AssertUtils.notNull(dto, "dto不能为空");
		orderItemBL.insertOrderItem(dto);
	}
	
	@Override
	public void insertOrderItems(List<OrderItemDTO> dtoList) {
		AssertUtils.notEmpty(dtoList, "列表不能为空");
		orderItemBL.insertOrderItems(dtoList);
	}
	
	@Override
	public PageList<OrderItemDTO> listOrderItem(OrderItemQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		PageList<OrderItemDTO> listOrderItem = orderItemBL.listOrderItem(query);
		return listOrderItem;
	}
}

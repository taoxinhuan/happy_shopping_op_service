/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.OrderDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.OrderQuery;
import com.happy.service.main.converter.OrderConverter;
import com.happy.service.main.dao.OrderMapper;
import com.happy.service.main.po.Order;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:51:27
 */
@Service
public class OrderBL {
	@Autowired
	private OrderMapper orderMapper;
	
	public void insertOrder(OrderDTO dto) {
		Order order = OrderConverter.toOrder(dto);
		orderMapper.insertOrder(order);
	}
	
	public void payForOrder(Long orderId) {
		orderMapper.payForOrder(orderId);
	}
	
	public void dropOrder(Long orderId) {
		orderMapper.dropOrder(orderId);
	}
	
	public PageList<OrderDTO> listOrder(OrderQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<Order> listOrder = orderMapper.listOrder(query);
		PageList<OrderDTO> pageList = new PageList<>();
		Long total = listOrder.getTotal();
		List<OrderDTO> orderDTOList = OrderConverter.toOrderDTOList(listOrder);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(orderDTOList);
		pageList.setPager(pager);
		return pageList;
	}
}

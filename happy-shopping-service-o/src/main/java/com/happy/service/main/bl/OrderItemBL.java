/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.OrderItemDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.OrderItemQuery;
import com.happy.service.main.converter.OrderItemConverter;
import com.happy.service.main.dao.OrderItemMapper;
import com.happy.service.main.po.OrderItem;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:30:09
 */
@Service
public class OrderItemBL {
	@Autowired
	private OrderItemMapper orderItemMapper;
	
	public void insertOrderItem(OrderItemDTO dto) {
		OrderItem orderItem = OrderItemConverter.toOrderItem(dto);
		orderItemMapper.insertOrderItem(orderItem);
	}
	
	public void insertOrderItems(List<OrderItemDTO> dtoList) {
		List<OrderItem> orderItemList = OrderItemConverter.toOrderItemList(dtoList);
		orderItemMapper.insertOrderItems(orderItemList);
	}
	
	public PageList<OrderItemDTO> listOrderItem(OrderItemQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<OrderItem> listOrderItem = orderItemMapper.listOrderItem(query);
		PageList<OrderItemDTO> pageList = new PageList<>();
		Long total = listOrderItem.getTotal();
		List<OrderItemDTO> orderItemDTOList = OrderItemConverter.toOrderItemDTOList(listOrderItem);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(orderItemDTOList);
		pageList.setPager(pager);
		return pageList;
	}
}

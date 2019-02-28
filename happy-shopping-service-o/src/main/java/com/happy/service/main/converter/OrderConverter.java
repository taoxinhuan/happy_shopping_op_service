/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.OrderDTO;
import com.happy.service.main.po.Order;

/**
 * @description :订单转换类
 * @author taoxinhuan
 * @date 2018年11月8日 下午4:04:09
 */
public class OrderConverter {
	public static OrderDTO toOrderDTO(Order po) {
		if (null != po) {
			OrderDTO dto = new OrderDTO();
			dto.setAmount(po.getAmount());
			dto.setId(po.getId());
			dto.setState(po.getState());
			dto.setUserAddressId(po.getUserAddressId());
			dto.setUserId(dto.getUserId());
			dto.setUserShoppingCartId(dto.getUserShoppingCartId());
			return dto;
		}
		return null;
	}
	
	public static Order toOrder(OrderDTO dto) {
		if (null != dto) {
			Order po = new Order();
			po.setAmount(dto.getAmount());
			po.setId(dto.getId());
			po.setState(dto.getState());
			po.setUserAddressId(dto.getUserAddressId());
			po.setUserId(dto.getUserId());
			po.setUserShoppingCartId(dto.getUserShoppingCartId());
			return po;
		}
		return null;
	}
	
	public static List<OrderDTO> toOrderDTOList(List<Order> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<OrderDTO> dtoList = new ArrayList<OrderDTO>();
			poList.forEach(po -> {
				OrderDTO orderDTO = toOrderDTO(po);
				dtoList.add(orderDTO);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<Order> toOrderList(List<OrderDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<Order> poList = new ArrayList<Order>();
			dtoList.forEach(dto -> {
				Order order = toOrder(dto);
				poList.add(order);
			});
			return poList;
		}
		return null;
	}
}

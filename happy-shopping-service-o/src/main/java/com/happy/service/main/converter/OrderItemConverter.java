/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.OrderItemDTO;
import com.happy.service.main.po.OrderItem;

/**
 * @description:PO&DTO转换类
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:45:32
 */
public class OrderItemConverter {
	public static OrderItemDTO toOrderItemDTO(OrderItem po) {
		if (null != po) {
			OrderItemDTO dto = new OrderItemDTO();
			dto.setId(po.getId());
			dto.setOrderId(po.getOrderId());
			dto.setProductCount(po.getProductCount());
			dto.setProductId(po.getProductId());
			dto.setProductSkuId(po.getProductSkuId());
			return dto;
		}
		return null;
	}
	
	public static OrderItem toOrderItem(OrderItemDTO dto) {
		if (null != dto) {
			OrderItem po = new OrderItem();
			po.setId(dto.getId());
			po.setOrderId(dto.getOrderId());
			po.setProductCount(dto.getProductCount());
			po.setProductId(dto.getProductId());
			po.setProductSkuId(dto.getProductSkuId());
			return po;
		}
		return null;
	}
	
	public static List<OrderItemDTO> toOrderItemDTOList(List<OrderItem> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<OrderItemDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				OrderItemDTO orderItemDTO = toOrderItemDTO(po);
				dtoList.add(orderItemDTO);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<OrderItem> toOrderItemList(List<OrderItemDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<OrderItem> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				OrderItem orderItem = toOrderItem(dto);
				poList.add(orderItem);
			});
			return poList;
		}
		return null;
	}
}

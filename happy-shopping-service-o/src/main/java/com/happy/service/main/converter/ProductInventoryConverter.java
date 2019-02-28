/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.ProductInventoryDTO;
import com.happy.service.main.po.ProductInventory;

/**
 * @description ：商品库存转换类
 * @author taoxinhuan
 * @date 2018年11月8日 下午4:33:44
 */
public class ProductInventoryConverter {
	public static ProductInventoryDTO toProductInventoryDTO(ProductInventory po) {
		if (null != po) {
			ProductInventoryDTO dto = new ProductInventoryDTO();
			dto.setCount(po.getCount());
			dto.setId(po.getId());
			dto.setProductId(po.getProductId());
			dto.setShopId(po.getShopId());
			return dto;
		}
		return null;
	}
	
	public static ProductInventory toProductInventory(ProductInventoryDTO dto) {
		if (null != dto) {
			ProductInventory po = new ProductInventory();
			po.setCount(dto.getCount());
			po.setId(dto.getId());
			po.setProductId(dto.getProductId());
			po.setShopId(dto.getShopId());
			return po;
		}
		return null;
	}
	
	public List<ProductInventoryDTO> toProductInventoryDTOList(List<ProductInventory> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<ProductInventoryDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				ProductInventoryDTO dto = toProductInventoryDTO(po);
				dtoList.add(dto);
			});
			return dtoList;
		}
		return null;
	}
	
	public List<ProductInventory> toProductInventoryList(List<ProductInventoryDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<ProductInventory> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				ProductInventory po = toProductInventory(dto);
				poList.add(po);
			});
			return poList;
		}
		return null;
	}
}

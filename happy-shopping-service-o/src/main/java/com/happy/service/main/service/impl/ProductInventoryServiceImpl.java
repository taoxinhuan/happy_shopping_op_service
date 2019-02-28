/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.ProductInventoryDTO;
import com.happy.core.service.ProductInventoryService;
import com.happy.service.main.bl.ProductInventoryBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:08:30
 */
@Service
public class ProductInventoryServiceImpl implements ProductInventoryService {
	@Autowired
	private ProductInventoryBL productInventoryBL;
	
	@Override
	public void insertProductInventory(ProductInventoryDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		productInventoryBL.insertProductInventory(dto);
	}
	
	@Override
	public void updateProductInventory(ProductInventoryDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		productInventoryBL.updateProductInventory(dto);
	}
	
	@Override
	public ProductInventoryDTO getByProductInventoryId(Long productId) {
		AssertUtils.notNull(productId, "产品不能为空");
		return productInventoryBL.getByProductInventoryId(productId);
	}
}

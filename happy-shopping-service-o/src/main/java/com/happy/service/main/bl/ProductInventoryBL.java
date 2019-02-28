/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.core.dto.ProductInventoryDTO;
import com.happy.service.main.converter.ProductInventoryConverter;
import com.happy.service.main.dao.ProductInventoryMapper;
import com.happy.service.main.po.ProductInventory;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:53:10
 */
@Service
public class ProductInventoryBL {
	@Autowired
	private ProductInventoryMapper productInventoryMapper;
	
	public void insertProductInventory(ProductInventoryDTO dto) {
		ProductInventory productInventory = ProductInventoryConverter.toProductInventory(dto);
		productInventoryMapper.insertProductInventory(productInventory);
	}
	
	public void updateProductInventory(ProductInventoryDTO dto) {
		ProductInventory productInventory = ProductInventoryConverter.toProductInventory(dto);
		productInventoryMapper.updateProductInventory(productInventory);
	}
	
	public ProductInventoryDTO getByProductInventoryId(Long productId) {
		ProductInventory productInventory = productInventoryMapper.getByProductInventoryId(productId);
		return ProductInventoryConverter.toProductInventoryDTO(productInventory);
	}
}

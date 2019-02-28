/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import com.happy.core.dto.ProductInventoryDTO;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:20:34
 */
public interface ProductInventoryService {
	/**
	 * @description:新增产品库存
	 * @param dto
	 * @return
	 * @return int
	 */
	void insertProductInventory(ProductInventoryDTO dto);
	
	/**
	 * @description:修改商品库存
	 * @param dto
	 * @return void
	 */
	void updateProductInventory(ProductInventoryDTO dto);
	
	/**
	 * @description:根据productID获取商品库存
	 * @param id
	 * @return
	 * @return ProductInventory
	 */
	ProductInventoryDTO getByProductInventoryId(Long productId);
}

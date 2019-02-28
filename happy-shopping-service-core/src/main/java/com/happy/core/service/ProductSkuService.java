/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import com.happy.core.dto.ProductSkuDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.ProductSkuQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:21:34
 */
public interface ProductSkuService {
	/**
	 * @description:新增商品规格
	 * @param dto
	 * @return void
	 */
	void insertProductSku(ProductSkuDTO dto);
	
	/**
	 * @description：分页查询商品规格
	 * @param query
	 * @return
	 * @return Page<ProductSku>
	 */
	PageList<ProductSkuDTO> listProductSku(ProductSkuQuery query);
	
	/**
	 * @description：修改商品规格
	 * @param dto
	 * @return void
	 */
	void updateProductSku(ProductSkuDTO dto);
	
	/**
	 * @description：启用商品规格
	 * @param skuId
	 * @param userId
	 * @return void
	 */
	void startProductSku(Long skuId, Long opUserId);
	
	/**
	 * @description：停用商品规格
	 * @param skuId
	 * @param userId
	 * @return void
	 */
	void stopProductSku(Long skuId, Long opUserId);
}

package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.happy.service.main.po.ProductInventory;

public interface ProductInventoryMapper {
	/**
	 * @description:新增产品库存
	 * @param po
	 * @return
	 * @return int
	 */
	void insertProductInventory(@Param("po") ProductInventory po);
	
	/**
	 * @description:修改商品库存
	 * @param po
	 * @return void
	 */
	void updateProductInventory(@Param("po") ProductInventory po);
	
	/**
	 * @description:根据productID获取商品库存
	 * @param id
	 * @return
	 * @return ProductInventory
	 */
	ProductInventory getByProductInventoryId(Long productId);
}

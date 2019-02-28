package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.ProductSkuQuery;
import com.happy.service.main.po.ProductSku;

public interface ProductSkuMapper {
	/**
	 * @description:新增商品规格
	 * @param po
	 * @return void
	 */
	void insertProductSku(@Param("po") ProductSku po);
	
	/**
	 * @description：分页查询商品规格
	 * @param query
	 * @return
	 * @return Page<ProductSku>
	 */
	Page<ProductSku> listProductSku(@Param("query") ProductSkuQuery query);
	
	/**
	 * @description：修改商品规格
	 * @param po
	 * @return void
	 */
	void updateProductSku(@Param("po") ProductSku po);
	
	/**
	 * @description：启用商品规格
	 * @param skuId
	 * @param userId
	 * @return void
	 */
	void startProductSku(@Param("skuId") Long skuId, @Param("opUserId") Long opUserId);
	
	/**
	 * @description：停用商品规格
	 * @param skuId
	 * @param userId
	 * @return void
	 */
	void stopProductSku(@Param("skuId") Long skuId, @Param("opUserId") Long opUserId);
}

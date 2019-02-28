package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.ShopQuery;
import com.happy.service.main.po.Shop;

public interface ShopMapper {
	/**
	 * @description :新增店铺
	 * @param record
	 * @return void
	 */
	void insertShop(@Param("po") Shop po);
	
	/**
	 * @description：修改店铺
	 * @param po
	 * @return void
	 */
	void updateShop(@Param("po") Shop po);
	
	/**
	 * @description：启用店铺
	 * @param shopId
	 * @param opUserId
	 * @return void
	 */
	void startShop(@Param("shopId") Long shopId, @Param("opUserId") Long opUserId);
	
	/**
	 * @description：停用店铺有
	 * @param shopId
	 * @param opUserId
	 * @return void
	 */
	void stopShop(@Param("shopId") Long shopId, @Param("opUserId") Long opUserId);
	
	/**
	 * @description：根据ID获取店铺
	 * @param id
	 * @return
	 * @return Shop
	 */
	Shop getShopById(Long id);
	
	/**
	 * @description：分页查询店铺
	 * @param query
	 * @return
	 * @return Page<Shop>
	 */
	Page<Shop> listShop(@Param("query") ShopQuery query);
}

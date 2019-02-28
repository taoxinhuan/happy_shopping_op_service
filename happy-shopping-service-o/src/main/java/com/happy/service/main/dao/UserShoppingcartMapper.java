package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.UserShoppingcartQuery;
import com.happy.service.main.po.UserShoppingcart;

public interface UserShoppingcartMapper {
	/**
	 * @description:删除购物车
	 * @param id
	 * @return
	 * @return int
	 */
	void deleteShoppingcart(Long id);
	
	/**
	 * @description:新增购物车
	 * @param record
	 * @return
	 * @return int
	 */
	void insertShoppingcart(@Param("po") UserShoppingcart po);
	
	/**
	 * @description:修改购物车
	 * @param record
	 * @return
	 * @return int
	 */
	void updateShoppingcart(@Param("po") UserShoppingcart po);
	
	/**
	 * @description:分页查询购物车商品
	 * @param id
	 * @return
	 * @return Page<UserShoppingcart>
	 */
	Page<UserShoppingcart> listUserShoppingcart(@Param("query") UserShoppingcartQuery query);
}

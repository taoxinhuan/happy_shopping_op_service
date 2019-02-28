package com.happy.service.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.UserAddressQuery;
import com.happy.service.main.po.UserAddress;

public interface UserAddressMapper {
	/**
	 * @description:新增用户收获地址
	 * @param userAddress
	 * @return void
	 */
	void insertUserAddress(@Param("po") UserAddress po);
	
	/**
	 * @description:修改用户收获地址
	 * @param userAddress
	 * @return void
	 */
	void updateUserAddress(@Param("po") UserAddress po);
	
	/**
	 * @description:分页查询用户收获地址
	 * @return
	 * @return Page<UserAddress>
	 */
	Page<UserAddress> listUserAddress(@Param("query") UserAddressQuery query);
	
	/**
	 * @description
	 * @param userId
	 * @return void
	 */
	List<UserAddress> listByUserId(@Param("userId") Long userId);
}

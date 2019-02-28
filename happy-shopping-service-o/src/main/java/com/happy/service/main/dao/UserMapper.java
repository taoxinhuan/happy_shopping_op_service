package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.UserQuery;
import com.happy.service.main.po.User;

public interface UserMapper {
	/**
	 * @description:新增用户
	 * @param record
	 * @return
	 * @return int
	 */
	void insertUser(@Param("user") User user);
	
	/**
	 * @description:修改用户
	 * @param record
	 * @return
	 * @return int
	 */
	void updateUser(@Param("user") User user);
	
	/**
	 * @description:分页查询用户
	 * @param query
	 * @return
	 * @return Page<User>
	 */
	Page<User> listUser(@Param("query") UserQuery query);
	
	/**
	 * @description:启用用户
	 * @param userId
	 * @param opUserId
	 * @return void
	 */
	void startUser(@Param("userId") Long userId, @Param("opUserId") Long opUserId);
	
	/**
	 * @description:停用用户
	 * @param userId
	 * @param opUserId
	 * @return void
	 */
	void stopUser(@Param("userId") Long userId, @Param("opUserId") Long opUserId);
	
	/**
	 * @description :根据id获取单个用户
	 * @param id
	 * @return
	 * @return User
	 */
	User getUserById(Long id);
	
	/**
	 * @description :用户登陆验证
	 * @param account
	 * @param password
	 * @return void
	 */
	User getUserByLogin(@Param("account") String account, @Param("password") String password,
			@Param("type") Integer type);
	
	/**
	 * @description
	 * @param mobile
	 * @return void
	 */
	User getKeeperByMobile(@Param("mobile") String mobile);
}

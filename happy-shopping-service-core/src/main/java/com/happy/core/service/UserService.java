/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import java.util.Map;
import java.util.Set;

import com.happy.core.dto.UserDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.UserQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:19:50
 */
public interface UserService {
	/**
	 * @description:新增用户
	 * @param dto
	 * @return
	 * @return void
	 */
	void insertUser(UserDTO dto, Long opUserId);
	
	/**
	 * @description:修改用户
	 * @param dto
	 * @return
	 * @return void
	 */
	void updateUser(UserDTO dto, Long opUserId);
	
	/**
	 * @description:分页查询用户
	 * @param query
	 * @return
	 * @return Page<User>
	 */
	PageList<UserDTO> listUser(UserQuery query);
	
	/**
	 * @description:启用用户
	 * @param userId
	 * @param opUserId
	 * @return void
	 */
	void startUser(Long userId, Long opUserId);
	
	/**
	 * @description:停用用户
	 * @param userId
	 * @param opUserId
	 * @return void
	 */
	void stopUser(Long userId, Long opUserId);
	
	/**
	 * @description：根据UserIdSet查询用户收货地址列表
	 * @param userIdSet
	 * @return
	 * @return Map<Long,UserDTO>
	 */
	Map<Long, UserDTO> getMapByUserIdSet(Set<Long> userIdSet);
	
	/**
	 * @description :用户登陆
	 * @param account
	 * @param password
	 * @return
	 * @return UserDTO
	 */
	UserDTO getUserByLogin(String account, String password, Integer type);
	
	/**
	 * 根据手机查询拥有店主身份的会员
	 * @description
	 * @param mobile
	 * @return
	 * @return UserDTO
	 */
	UserDTO getKeeperByMobile(String mobile);
	
	/**
	 * @description：根据Id获取用户信息
	 * @param id
	 * @return
	 * @return UserDTO
	 */
	UserDTO getUserById(Long id);
}

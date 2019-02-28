/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.UserDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.UserQuery;
import com.happy.core.service.UserService;
import com.happy.service.main.bl.UserBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:14:44
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserBL userBL;
	
	@Override
	public void insertUser(UserDTO dto, Long opUserId) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		userBL.insertUser(dto, opUserId);
	}
	
	@Override
	public void updateUser(UserDTO dto, Long opUserId) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		AssertUtils.notNull(dto.getId(), "传入对象id不能为空");
		userBL.updateUser(dto, opUserId);
	}
	
	@Override
	public PageList<UserDTO> listUser(UserQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return userBL.listUser(query);
	}
	
	@Override
	public void startUser(Long userId, Long opUserId) {
		AssertUtils.notNull(userId, "userId不能为空");
		AssertUtils.notNull(opUserId, "操作人ID不能为空");
		userBL.startUser(userId, opUserId);
	}
	
	@Override
	public void stopUser(Long userId, Long opUserId) {
		AssertUtils.notNull(userId, "userId不能为空");
		AssertUtils.notNull(opUserId, "操作人ID不能为空");
		userBL.stopUser(userId, opUserId);
	}
	
	@Override
	public Map<Long, UserDTO> getMapByUserIdSet(Set<Long> userIdSet) {
		AssertUtils.notEmpty(userIdSet, "userIdSet集合不能为空");
		return userBL.getMapByUserIdSet(userIdSet);
	}
	
	@Override
	public UserDTO getUserByLogin(String account, String password, Integer type) {
		AssertUtils.notNull(account, "帐号不能为空");
		AssertUtils.notNull(password, "密码不能为空");
		return userBL.getUserByLogin(account, password, type);
	}
	
	@Override
	public UserDTO getKeeperByMobile(String mobile) {
		AssertUtils.notNull(mobile, "手机号不能为空");
		return userBL.getKeeperByMobile(mobile);
	}
	
	@Override
	public UserDTO getUserById(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		return userBL.getUserById(id);
	}
}

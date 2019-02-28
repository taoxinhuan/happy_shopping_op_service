/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.UserDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.UserQuery;
import com.happy.service.main.converter.UserConverter;
import com.happy.service.main.dao.UserMapper;
import com.happy.service.main.po.User;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午11:04:51
 */
@Service
public class UserBL {
	@Autowired
	private UserMapper userMapper;
	
	public void insertUser(UserDTO dto, Long opUserId) {
		User user = UserConverter.toUser(dto);
		user.setCreateUserId(opUserId);
		user.setLastUpdateUserId(opUserId);
		if (user.getPassword() == null) {
			user.setPassword("123456");
		}
		userMapper.insertUser(user);
	}
	
	public void updateUser(UserDTO dto, Long opUserId) {
		User user = UserConverter.toUser(dto);
		user.setLastUpdateTime(new Date());
		user.setLastUpdateUserId(opUserId);
		userMapper.updateUser(user);
	}
	
	public PageList<UserDTO> listUser(UserQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<User> listUser = userMapper.listUser(query);
		PageList<UserDTO> pageList = new PageList<>();
		Long total = listUser.getTotal();
		List<UserDTO> UserDTOList = UserConverter.toUserDTOList(listUser);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(UserDTOList);
		pageList.setPager(pager);
		return pageList;
	}
	
	public void startUser(Long userId, Long opUserId) {
		userMapper.startUser(userId, opUserId);
	}
	
	public void stopUser(Long userId, Long opUserId) {
		userMapper.stopUser(userId, opUserId);
	}
	
	public Map<Long, UserDTO> getMapByUserIdSet(Set<Long> userIdSet) {
		Map<Long, UserDTO> map = new HashMap<Long, UserDTO>();
		userIdSet.forEach(userId -> {
			User user = userMapper.getUserById(userId);
			UserDTO userDTO = UserConverter.toUserDTO(user);
			map.put(userId, userDTO);
		});
		return map;
	}
	
	public UserDTO getUserByLogin(String account, String password, Integer type) {
		User user = userMapper.getUserByLogin(account, password, type);
		return UserConverter.toUserDTO(user);
	}
	
	public UserDTO getUserById(Long id) {
		User user = userMapper.getUserById(id);
		return UserConverter.toUserDTO(user);
	}
	
	/**
	 * @description
	 * @param mobile
	 * @return
	 * @return UserDTO
	 */
	public UserDTO getKeeperByMobile(String mobile) {
		User keeper = userMapper.getKeeperByMobile(mobile);
		return UserConverter.toUserDTO(keeper);
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.UserAddressDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.UserAddressQuery;
import com.happy.core.service.UserAddressService;
import com.happy.service.main.bl.UserAddressBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:14:00
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {
	@Autowired
	private UserAddressBL userAddressBL;
	
	@Override
	public void insertUserAddress(UserAddressDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		userAddressBL.insertUserAddress(dto);
	}
	
	@Override
	public void updateUserAddress(UserAddressDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		userAddressBL.updateUserAddress(dto);
	}
	
	@Override
	public PageList<UserAddressDTO> listUserAddress(UserAddressQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return userAddressBL.listUserAddress(query);
	}
	
	@Override
	public List<UserAddressDTO> listByUserId(Long userId) {
		AssertUtils.notNull(userId, "userId不能为空");
		return userAddressBL.listByUserId(userId);
	}
	
	@Override
	public Map<Long, List<UserAddressDTO>> listByUserIdSet(Set<Long> userIdSet) {
		AssertUtils.notEmpty(userIdSet, "userIdSet不能为空");
		Map<Long, List<UserAddressDTO>> listByUserIdSet = userAddressBL.listByUserIdSet(userIdSet);
		return listByUserIdSet;
	}
}

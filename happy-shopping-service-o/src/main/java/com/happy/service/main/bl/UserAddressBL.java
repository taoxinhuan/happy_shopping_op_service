/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.UserAddressDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.UserAddressQuery;
import com.happy.service.main.converter.UserAddressConverter;
import com.happy.service.main.dao.UserAddressMapper;
import com.happy.service.main.po.UserAddress;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午11:02:22
 */
@Service
public class UserAddressBL {
	@Autowired
	private UserAddressMapper userAddressMapper;
	
	public void insertUserAddress(UserAddressDTO dto) {
		UserAddress userAddress = UserAddressConverter.toUserAddress(dto);
		userAddressMapper.insertUserAddress(userAddress);
	}
	
	public void updateUserAddress(UserAddressDTO dto) {
		UserAddress userAddress = UserAddressConverter.toUserAddress(dto);
		userAddressMapper.updateUserAddress(userAddress);
	}
	
	public PageList<UserAddressDTO> listUserAddress(UserAddressQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<UserAddress> listUserAddress = userAddressMapper.listUserAddress(query);
		PageList<UserAddressDTO> pageList = new PageList<>();
		Long total = listUserAddress.getTotal();
		List<UserAddressDTO> UserAddressDTOList = UserAddressConverter.toUserAddressDTOList(listUserAddress);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(UserAddressDTOList);
		pageList.setPager(pager);
		return pageList;
	}
	
	/**
	 * @description
	 * @param userId
	 * @return
	 * @return List<UserAddressDTO>
	 */
	public List<UserAddressDTO> listByUserId(Long userId) {
		List<UserAddress> listByUserId = userAddressMapper.listByUserId(userId);
		return UserAddressConverter.toUserAddressDTOList(listByUserId);
	}
	
	/**
	 * @description
	 * @param userIdSet
	 * @return
	 * @return Map<Long,List<UserAddressDTO>>
	 */
	public Map<Long, List<UserAddressDTO>> listByUserIdSet(Set<Long> userIdSet) {
		Map<Long, List<UserAddressDTO>> map = new HashMap<Long, List<UserAddressDTO>>();
		if (CollectionUtils.isNotEmpty(userIdSet)) {
			userIdSet.forEach(userId -> {
				List<UserAddressDTO> listByUserId = listByUserId(userId);
				map.put(userId, listByUserId);
			});
		}
		return map;
	}
}

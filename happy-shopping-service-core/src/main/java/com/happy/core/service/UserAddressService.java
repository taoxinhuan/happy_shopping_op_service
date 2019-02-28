/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.happy.core.dto.UserAddressDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.UserAddressQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:20:14
 */
public interface UserAddressService {
	/**
	 * @description:新增用户收获地址
	 * @param dto
	 * @return void
	 */
	void insertUserAddress(UserAddressDTO dto);
	
	/**
	 * @description:修改用户收获地址
	 * @param dto
	 * @return void
	 */
	void updateUserAddress(UserAddressDTO dto);
	
	/**
	 * @description:分页查询用户收获地址
	 * @return
	 * @return Page<UserAddress>
	 */
	PageList<UserAddressDTO> listUserAddress(UserAddressQuery query);
	
	/**
	 * @description
	 * @param userId
	 * @return
	 * @return List<UserAddressDTO>
	 */
	List<UserAddressDTO> listByUserId(Long userId);
	
	/**
	 * @description
	 * @param userIdSet
	 * @return
	 * @return Map<Long,List<UserAddressDTO>>
	 */
	Map<Long, List<UserAddressDTO>> listByUserIdSet(Set<Long> userIdSet);
}

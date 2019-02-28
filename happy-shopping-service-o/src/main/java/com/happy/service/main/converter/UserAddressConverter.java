/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.UserAddressDTO;
import com.happy.service.main.po.UserAddress;

/**
 * @description：用户收货地址转换类
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:13:07
 */
public class UserAddressConverter {
	public static UserAddressDTO toUserAddressDTO(UserAddress po) {
		if (null != po) {
			UserAddressDTO dto = new UserAddressDTO();
			dto.setId(po.getId());
			dto.setAddress(po.getAddress());
			dto.setCity(po.getCity());
			dto.setCounty(po.getCounty());
			dto.setProvince(po.getProvince());
			dto.setStreet(po.getStreet());
			dto.setUserId(po.getUserId());
			return dto;
		}
		return null;
	}
	
	public static UserAddress toUserAddress(UserAddressDTO dto) {
		if (null != dto) {
			UserAddress po = new UserAddress();
			po.setId(dto.getId());
			po.setAddress(dto.getAddress());
			po.setCity(dto.getCity());
			po.setCounty(dto.getCounty());
			po.setProvince(dto.getCounty());
			po.setStreet(dto.getStreet());
			po.setUserId(dto.getUserId());
			return po;
		}
		return null;
	}
	
	public static List<UserAddressDTO> toUserAddressDTOList(List<UserAddress> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<UserAddressDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				UserAddressDTO dto = toUserAddressDTO(po);
				dtoList.add(dto);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<UserAddress> toUserAddressList(List<UserAddressDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<UserAddress> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				UserAddress po = toUserAddress(dto);
				poList.add(po);
			});
			return poList;
		}
		return null;
	}
}

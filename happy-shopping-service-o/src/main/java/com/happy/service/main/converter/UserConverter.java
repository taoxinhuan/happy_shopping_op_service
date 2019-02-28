/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.UserDTO;
import com.happy.service.main.po.User;

/**
 * @description：用户转换类
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:09:07
 */
public class UserConverter {
	public static UserDTO toUserDTO(User po) {
		if (null != po) {
			UserDTO dto = new UserDTO();
			dto.setId(po.getId());
			dto.setMobile(po.getMobile());
			dto.setNickname(po.getNickname());
			dto.setPassword(po.getPassword());
			dto.setRealname(po.getRealname());
			dto.setType(po.getType());
			dto.setState(po.getState());
			dto.setCreateTime(po.getCreateTime());
			return dto;
		}
		return null;
	}
	
	public static User toUser(UserDTO dto) {
		if (null != dto) {
			User po = new User();
			po.setId(dto.getId());
			po.setMobile(dto.getMobile());
			po.setNickname(dto.getNickname());
			po.setPassword(dto.getPassword());
			po.setRealname(dto.getRealname());
			po.setType(dto.getType());
			po.setState(dto.getState());
			return po;
		}
		return null;
	}
	
	public static List<UserDTO> toUserDTOList(List<User> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<UserDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				UserDTO dto = toUserDTO(po);
				dtoList.add(dto);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<User> toUserList(List<UserDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<User> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				User po = toUser(dto);
				poList.add(po);
			});
			return poList;
		}
		return null;
	}
}

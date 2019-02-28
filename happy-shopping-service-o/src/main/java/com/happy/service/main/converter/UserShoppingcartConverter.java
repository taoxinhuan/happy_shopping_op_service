/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.UserShoppingcartDTO;
import com.happy.service.main.po.UserShoppingcart;

/**
 * @description：用户购物车转换类
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:22:48
 */
public class UserShoppingcartConverter {
	public static UserShoppingcartDTO toUserShoppingcartDTO(UserShoppingcart po) {
		if (null != po) {
			UserShoppingcartDTO dto = new UserShoppingcartDTO();
			dto.setId(po.getId());
			dto.setCount(po.getCount());
			dto.setProductId(po.getProductId());
			dto.setProductSkuId(po.getProductSkuId());
			dto.setUserId(po.getUserId());
			return dto;
		}
		return null;
	}
	
	public static UserShoppingcart toUserShoppingcart(UserShoppingcartDTO dto) {
		if (null != dto) {
			UserShoppingcart po = new UserShoppingcart();
			po.setId(dto.getId());
			po.setCount(dto.getCount());
			po.setProductId(dto.getProductId());
			po.setProductSkuId(dto.getProductSkuId());
			po.setUserId(dto.getUserId());
			return po;
		}
		return null;
	}
	
	public static List<UserShoppingcartDTO> toUserShoppingcartDTOList(List<UserShoppingcart> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<UserShoppingcartDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				UserShoppingcartDTO dto = toUserShoppingcartDTO(po);
				dtoList.add(dto);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<UserShoppingcart> toUserShoppingcartList(List<UserShoppingcartDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<UserShoppingcart> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				UserShoppingcart po = toUserShoppingcart(dto);
				poList.add(po);
			});
			return poList;
		}
		return null;
	}
}

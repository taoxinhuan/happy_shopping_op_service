/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.ShopDTO;
import com.happy.service.main.po.Shop;

/**
 * @description：店铺转换类
 * @author taoxinhuan
 * @date 2018年11月9日 上午9:58:26
 */
public class ShopConverter {
	public static ShopDTO toShopDTO(Shop po) {
		if (null != po) {
			ShopDTO dto = new ShopDTO();
			dto.setId(po.getId());
			dto.setAddress(po.getAddress());
			dto.setKeeperId(po.getKeeperId());
			dto.setLatitude(po.getLatitude());
			dto.setLongitude(po.getLongitude());
			dto.setName(po.getName());
			dto.setState(po.getState());
			dto.setKeeperName(po.getKeeperName());
			dto.setMobile(po.getMobile());
			dto.setCreateTime(po.getCreateTime());
			return dto;
		}
		return null;
	}
	
	public static Shop toShop(ShopDTO dto) {
		if (null != dto) {
			Shop po = new Shop();
			po.setId(dto.getId());
			po.setAddress(dto.getAddress());
			po.setKeeperId(dto.getKeeperId());
			po.setLatitude(dto.getLatitude());
			po.setLongitude(dto.getLongitude());
			po.setName(dto.getName());
			po.setState(dto.getState());
			po.setMobile(dto.getMobile());
			po.setKeeperName(dto.getKeeperName());
			return po;
		}
		return null;
	}
	
	public static List<ShopDTO> toShopDTOList(List<Shop> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<ShopDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				ShopDTO dto = toShopDTO(po);
				dtoList.add(dto);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<Shop> toShopList(List<ShopDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<Shop> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				Shop po = toShop(dto);
				poList.add(po);
			});
			return poList;
		}
		return null;
	}
}

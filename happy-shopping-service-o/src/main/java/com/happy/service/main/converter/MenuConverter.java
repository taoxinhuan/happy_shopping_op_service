/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.MenuDTO;
import com.happy.service.main.po.Menu;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:29:36
 */
public class MenuConverter {
	public static MenuDTO toMenuDTO(Menu po) {
		if (null != po) {
			MenuDTO dto = new MenuDTO();
			dto.setId(po.getId());
			dto.setIcon(po.getIcon());
			dto.setParentId(po.getParentId());
			dto.setPrivilegeName(po.getPrivilegeName());
			dto.setPrivilegeType(po.getPrivilegeType());
			dto.setSequence(po.getSequence());
			dto.setTitle(po.getTitle());
			dto.setUrl(po.getUrl());
			return dto;
		}
		return null;
	}
	
	public static Menu toMenu(MenuDTO dto) {
		if (null != dto) {
			Menu po = new Menu();
			po.setId(dto.getId());
			po.setIcon(dto.getIcon());
			po.setParentId(dto.getParentId());
			po.setPrivilegeName(dto.getPrivilegeName());
			po.setPrivilegeType(dto.getPrivilegeType());
			po.setSequence(dto.getSequence());
			po.setTitle(dto.getTitle());
			po.setUrl(dto.getUrl());
			return po;
		}
		return null;
	}
	
	public static List<MenuDTO> toMenuDTOList(List<Menu> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<MenuDTO> dtoList = new ArrayList<MenuDTO>();
			poList.forEach(po -> {
				MenuDTO MenuDTO = toMenuDTO(po);
				dtoList.add(MenuDTO);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<Menu> toMenuList(List<MenuDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<Menu> poList = new ArrayList<Menu>();
			dtoList.forEach(dto -> {
				Menu Menu = toMenu(dto);
				poList.add(Menu);
			});
			return poList;
		}
		return null;
	}
}

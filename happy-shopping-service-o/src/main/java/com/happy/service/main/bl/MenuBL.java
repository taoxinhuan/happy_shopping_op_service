/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.MenuDTO;
import com.happy.service.main.converter.MenuConverter;
import com.happy.service.main.dao.MenuMapper;
import com.happy.service.main.po.Menu;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:22:45
 */
@Service
public class MenuBL {
	@Autowired
	private MenuMapper menuMapper;
	
	public List<MenuDTO> listMenu() {
		List<Menu> listMenu = menuMapper.listMenu();
		List<MenuDTO> menuDTOList = MenuConverter.toMenuDTOList(listMenu);
		if (CollectionUtils.isNotEmpty(menuDTOList)) {
			menuDTOList.forEach(menuDTO -> {
				Long pid = menuDTO.getId();
				List<MenuDTO> sonMenuDTOList = listSonMenu(pid);
				menuDTO.setSonMenu(sonMenuDTOList);
			});
		}
		return menuDTOList;
	}
	
	public void insertMenu(MenuDTO dto) {
		menuMapper.insertMenu(MenuConverter.toMenu(dto));
	}
	
	public void updateMenu(MenuDTO dto) {
		Menu menu = MenuConverter.toMenu(dto);
		menuMapper.updateMenu(menu);
	}
	
	public void deleteMenu(Long id) {
		menuMapper.deleteMenu(id);
	}
	
	public List<MenuDTO> listSonMenu(Long pid) {
		List<Menu> listSonMenu = menuMapper.listSonMenu(pid);
		List<MenuDTO> sonMenuDTOList = MenuConverter.toMenuDTOList(listSonMenu);
		return sonMenuDTOList;
	}
	
	/**
	 * @description
	 * @param id
	 * @return
	 * @return MenuDTO
	 */
	public MenuDTO getMenuById(Long id) {
		Menu menu = menuMapper.getById(id);
		MenuDTO menuDTO = MenuConverter.toMenuDTO(menu);
		return menuDTO;
	}
}

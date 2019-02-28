/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.MenuDTO;
import com.happy.core.service.MenuService;
import com.happy.service.main.bl.MenuBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:20:19
 */
@Service
public class MenuServiceIml implements MenuService {
	@Autowired
	private MenuBL menuBL;
	
	@Override
	public List<MenuDTO> listMenu() {
		List<MenuDTO> listMenu = menuBL.listMenu();
		return listMenu;
	}
	
	@Override
	public void insertMenu(MenuDTO dto) {
		AssertUtils.notNull(dto, "对象不能为空");
		menuBL.insertMenu(dto);
	}
	
	@Override
	public void updateMenu(MenuDTO dto) {
		AssertUtils.notNull(dto, "对象不能为空");
		menuBL.updateMenu(dto);
	}
	
	@Override
	public void deleteMenu(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		menuBL.deleteMenu(id);
	}
	
	@Override
	public List<MenuDTO> listSonMenu(Long pid) {
		AssertUtils.notNull(pid, "id不能为空");
		return menuBL.listSonMenu(pid);
	}
	
	@Override
	public MenuDTO getMenuById(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		return menuBL.getMenuById(id);
	}
}

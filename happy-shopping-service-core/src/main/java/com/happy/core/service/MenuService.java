/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import java.util.List;

import com.happy.core.dto.MenuDTO;

/**
 * @description ：菜单
 * @author taoxinhuan
 * @date 2018年11月18日 上午10:47:34
 */
public interface MenuService {
	/**
	 * @description:查询菜单
	 * @return
	 * @return List<Menu>
	 */
	List<MenuDTO> listMenu();
	
	/**
	 * @description:增加菜单
	 * @param po
	 * @return void
	 */
	void insertMenu(MenuDTO dto);
	
	/**
	 * @description:修改菜单
	 * @param menu
	 * @return void
	 */
	void updateMenu(MenuDTO dto);
	
	/**
	 * @description:删除菜单
	 * @param id
	 * @return void
	 */
	void deleteMenu(Long id);
	
	/**
	 * @description:查询子菜单
	 * @return
	 * @return List<Menu>
	 */
	List<MenuDTO> listSonMenu(Long pid);
	
	/**
	 * @description
	 * @param id
	 * @return
	 * @return MenuDTO
	 */
	MenuDTO getMenuById(Long id);
}

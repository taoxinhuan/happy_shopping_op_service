package com.happy.service.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.happy.service.main.po.Menu;

public interface MenuMapper {
	/**
	 * @description:查询�?级菜�?
	 * @return
	 * @return List<Menu>
	 */
	List<Menu> listMenu();
	
	/**
	 * @description：查询二级菜�?
	 * @param parent_id
	 * @return
	 * @return List<Menu>
	 */
	List<Menu> listSonMenu(Long parentId);
	
	void insertMenu(@Param("po") Menu po);
	
	void updateMenu(@Param("po") Menu po);
	
	void deleteMenu(Long id);
	
	Menu getById(Long id);
}

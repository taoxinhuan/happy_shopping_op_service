/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.UserShoppingcartDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.UserShoppingcartQuery;
import com.happy.service.main.converter.UserShoppingcartConverter;
import com.happy.service.main.dao.UserShoppingcartMapper;
import com.happy.service.main.po.UserShoppingcart;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午11:06:05
 */
@Service
public class UserShoppingcartBL {
	@Autowired
	private UserShoppingcartMapper userShoppingcartMapper;
	
	public void deleteShoppingcart(Long id) {
		userShoppingcartMapper.deleteShoppingcart(id);
	}
	
	public void insertShoppingcart(UserShoppingcartDTO dto) {
		UserShoppingcart userShoppingcart = UserShoppingcartConverter.toUserShoppingcart(dto);
		userShoppingcartMapper.insertShoppingcart(userShoppingcart);
	}
	
	public void updateShoppingcart(UserShoppingcartDTO dto) {
		UserShoppingcart userShoppingcart = UserShoppingcartConverter.toUserShoppingcart(dto);
		userShoppingcartMapper.updateShoppingcart(userShoppingcart);
	}
	
	public PageList<UserShoppingcartDTO> listUserShoppingcart(UserShoppingcartQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<UserShoppingcart> listUserShoppingcart = userShoppingcartMapper.listUserShoppingcart(query);
		PageList<UserShoppingcartDTO> pageList = new PageList<>();
		Long total = listUserShoppingcart.getTotal();
		List<UserShoppingcartDTO> UserShoppingcartDTOList = UserShoppingcartConverter
				.toUserShoppingcartDTOList(listUserShoppingcart);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(UserShoppingcartDTOList);
		pageList.setPager(pager);
		return pageList;
	}
}

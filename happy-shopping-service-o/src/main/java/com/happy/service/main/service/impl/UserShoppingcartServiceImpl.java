/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.UserShoppingcartDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.UserShoppingcartQuery;
import com.happy.core.service.UserShoppingcartService;
import com.happy.service.main.bl.UserShoppingcartBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:15:30
 */
@Service
public class UserShoppingcartServiceImpl implements UserShoppingcartService {
	@Autowired
	private UserShoppingcartBL userShoppingcartBL;
	
	@Override
	public void deleteShoppingcart(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		userShoppingcartBL.deleteShoppingcart(id);
	}
	
	@Override
	public void insertShoppingcart(UserShoppingcartDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		userShoppingcartBL.insertShoppingcart(dto);
	}
	
	@Override
	public void updateShoppingcart(UserShoppingcartDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		userShoppingcartBL.updateShoppingcart(dto);
	}
	
	@Override
	public PageList<UserShoppingcartDTO> listUserShoppingcart(UserShoppingcartQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return userShoppingcartBL.listUserShoppingcart(query);
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import com.happy.core.dto.UserShoppingcartDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.UserShoppingcartQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:21:59
 */
public interface UserShoppingcartService {
	/**
	 * @description:删除购物车
	 * @param id
	 * @return
	 * @return void
	 */
	void deleteShoppingcart(Long id);
	
	/**
	 * @description:新增购物车
	 * @param record
	 * @return
	 * @return void
	 */
	void insertShoppingcart(UserShoppingcartDTO dto);
	
	/**
	 * @description:修改购物车
	 * @param record
	 * @return
	 * @return int
	 */
	void updateShoppingcart(UserShoppingcartDTO dto);
	
	/**
	 * @description:分页查询购物车商品
	 * @param id
	 * @return
	 * @return Page<UserShoppingcart>
	 */
	PageList<UserShoppingcartDTO> listUserShoppingcart(UserShoppingcartQuery query);
}

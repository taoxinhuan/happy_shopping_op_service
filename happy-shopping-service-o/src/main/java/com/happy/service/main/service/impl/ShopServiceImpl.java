/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.ShopDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.ShopQuery;
import com.happy.core.service.ShopService;
import com.happy.service.main.bl.ShopBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:12:46
 */
@Service
public class ShopServiceImpl implements ShopService {
	@Autowired
	private ShopBL shopBL;
	
	@Override
	public void insertShop(ShopDTO dto, Long opUserId) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		AssertUtils.notNull(opUserId, "opUserId不能为空");
		shopBL.insertShop(dto, opUserId);
	}
	
	@Override
	public void updateShop(ShopDTO dto, Long opUserId) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		AssertUtils.notNull(opUserId, "opUserId不能为空");
		shopBL.updateShop(dto, opUserId);
	}
	
	@Override
	public void startShop(Long shopId, Long opUserId) {
		AssertUtils.notNull(shopId, "shopId不能为空");
		AssertUtils.notNull(opUserId, "操作人ID不能为空");
		shopBL.startShop(shopId, opUserId);
	}
	
	@Override
	public void stopShop(Long shopId, Long opUserId) {
		AssertUtils.notNull(shopId, "shopId不能为空");
		AssertUtils.notNull(opUserId, "操作人ID不能为空");
		shopBL.stopShop(shopId, opUserId);
	}
	
	@Override
	public ShopDTO getShopById(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		return shopBL.getShopById(id);
	}
	
	@Override
	public Map<Long, ShopDTO> getMapByShopIds(Set<Long> shopIdSet) {
		AssertUtils.notEmpty(shopIdSet, "shopIdSet集合不能为空");
		return shopBL.getMapByShopIds(shopIdSet);
	}
	
	@Override
	public PageList<ShopDTO> listShop(ShopQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return shopBL.listShop(query);
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.ShopDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.ShopQuery;
import com.happy.service.main.converter.ShopConverter;
import com.happy.service.main.dao.ShopMapper;
import com.happy.service.main.po.Shop;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:57:44
 */
@Service
public class ShopBL {
	@Autowired
	private ShopMapper shopMapper;
	
	public void insertShop(ShopDTO dto, Long opUserId) {
		Shop shop = ShopConverter.toShop(dto);
		// 默认启用
		shop.setState(0);
		shop.setCreateUserId(opUserId);
		shop.setLastUpdateUserId(opUserId);
		shopMapper.insertShop(shop);
	}
	
	public void updateShop(ShopDTO dto, Long opUserId) {
		Shop shop = ShopConverter.toShop(dto);
		shop.setLastUpdateUserId(opUserId);
		shop.setLastUpdateTime(new Date());
		shopMapper.updateShop(shop);
	}
	
	public void startShop(Long shopId, Long opUserId) {
		shopMapper.startShop(shopId, opUserId);
	}
	
	public void stopShop(Long shopId, Long opUserId) {
		shopMapper.stopShop(shopId, opUserId);
	}
	
	public ShopDTO getShopById(Long id) {
		Shop shop = shopMapper.getShopById(id);
		return ShopConverter.toShopDTO(shop);
	}
	
	public Map<Long, ShopDTO> getMapByShopIds(Set<Long> shopIdSet) {
		Map<Long, ShopDTO> map = new HashMap<>();
		shopIdSet.forEach(shopId -> {
			ShopDTO shopDTO = getShopById(shopId);
			map.put(shopId, shopDTO);
		});
		return map;
	}
	
	public PageList<ShopDTO> listShop(ShopQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<Shop> listShop = shopMapper.listShop(query);
		PageList<ShopDTO> pageList = new PageList<>();
		Long total = listShop.getTotal();
		List<ShopDTO> shopDTOList = ShopConverter.toShopDTOList(listShop);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(shopDTOList);
		pageList.setPager(pager);
		return pageList;
	}
}

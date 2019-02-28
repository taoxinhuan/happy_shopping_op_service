/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import java.util.Map;
import java.util.Set;

import com.happy.core.dto.ShopDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.ShopQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:19:39
 */
public interface ShopService {
	/**
	 * @description :新增店铺
	 * @param dto
	 * @return void
	 */
	void insertShop(ShopDTO dto, Long opUserId);
	
	/**
	 * @description：修改店铺
	 * @param dto
	 * @return void
	 */
	void updateShop(ShopDTO dto, Long opUserId);
	
	/**
	 * @description：启用店铺
	 * @param shopId
	 * @param opUserId
	 * @return void
	 */
	void startShop(Long shopId, Long opUserId);
	
	/**
	 * @description：停用店铺有
	 * @param shopId
	 * @param opUserId
	 * @return void
	 */
	void stopShop(Long shopId, Long opUserId);
	
	/**
	 * @description：根据ID获取店铺
	 * @param id
	 * @return
	 * @return Shop
	 */
	ShopDTO getShopById(Long id);
	
	/**
	 * @description：根据店铺Id集合返回店铺信息
	 * @param shopIdSet
	 * @return
	 * @return Map<Long,ShopDTO>
	 */
	Map<Long, ShopDTO> getMapByShopIds(Set<Long> shopIdSet);
	
	/**
	 * @description:分页查询店铺
	 * @param query
	 * @return
	 * @return PageList<ShopDTO>
	 */
	PageList<ShopDTO> listShop(ShopQuery query);
}

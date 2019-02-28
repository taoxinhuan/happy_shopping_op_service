/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.ProductSkuDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.ProductSkuQuery;
import com.happy.core.service.ProductSkuService;
import com.happy.service.main.bl.ProductSkuBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:10:05
 */
@Service
public class ProductSkuServiceImpl implements ProductSkuService {
	@Autowired
	private ProductSkuBL productSkuBL;
	
	@Override
	public void insertProductSku(ProductSkuDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		productSkuBL.insertProductSku(dto);
	}
	
	@Override
	public PageList<ProductSkuDTO> listProductSku(ProductSkuQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return productSkuBL.listProductSku(query);
	}
	
	@Override
	public void updateProductSku(ProductSkuDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		productSkuBL.updateProductSku(dto);
	}
	
	@Override
	public void startProductSku(Long skuId, Long opUserId) {
		AssertUtils.notNull(skuId, "SkuId不能为空");
		AssertUtils.notNull(opUserId, "操作人ID不能为空");
		productSkuBL.startProductSku(skuId, opUserId);
	}
	
	@Override
	public void stopProductSku(Long skuId, Long opUserId) {
		AssertUtils.notNull(skuId, "SkuId不能为空");
		AssertUtils.notNull(opUserId, "操作人ID不能为空");
		productSkuBL.stopProductSku(skuId, opUserId);
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.ProductSkuDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.ProductSkuQuery;
import com.happy.service.main.converter.ProductSkuConverter;
import com.happy.service.main.dao.ProductSkuMapper;
import com.happy.service.main.po.ProductSku;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:56:15
 */
@Service
public class ProductSkuBL {
	@Autowired
	private ProductSkuMapper productSkuMapper;
	
	public void insertProductSku(ProductSkuDTO dto) {
		ProductSku productSku = ProductSkuConverter.toProductSku(dto);
		productSkuMapper.insertProductSku(productSku);
	}
	
	public PageList<ProductSkuDTO> listProductSku(ProductSkuQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<ProductSku> listProductSku = productSkuMapper.listProductSku(query);
		PageList<ProductSkuDTO> pageList = new PageList<>();
		Long total = listProductSku.getTotal();
		List<ProductSkuDTO> productSkuDTOList = ProductSkuConverter.toProductSkuDTOList(listProductSku);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(productSkuDTOList);
		pageList.setPager(pager);
		return pageList;
	}
	
	public void updateProductSku(ProductSkuDTO dto) {
		ProductSku productSku = ProductSkuConverter.toProductSku(dto);
		productSkuMapper.updateProductSku(productSku);
	}
	
	public void startProductSku(Long skuId, Long opUserId) {
		productSkuMapper.startProductSku(skuId, opUserId);
	}
	
	public void stopProductSku(Long skuId, Long opUserId) {
		productSkuMapper.stopProductSku(skuId, opUserId);
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.ProductDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.ProductQuery;
import com.happy.core.service.ProductService;
import com.happy.service.main.bl.ProductBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 下午2:08:57
 */
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductBL productBL;
	
	@Override
	public void insertProductDTO(ProductDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		productBL.insertProductDTO(dto);
	}
	
	@Override
	public void deleteProductDTO(Long id) {
		AssertUtils.notNull(id, "产品不能为空");
		productBL.deleteProductDTO(id);
	}
	
	@Override
	public void updateProductDTO(ProductDTO dto) {
		AssertUtils.notNull(dto, "传入对象不能为空");
		productBL.updateProductDTO(dto);
	}
	
	@Override
	public PageList<ProductDTO> listProductDTO(ProductQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return productBL.listProductDTO(query);
	}
	
	@Override
	public Map<Long, ProductDTO> getMapByproductIdSet(Set<Long> idSet) {
		AssertUtils.notEmpty(idSet, "idSet集合不能为空");
		return productBL.getMapByproductIdSet(idSet);
	}
}

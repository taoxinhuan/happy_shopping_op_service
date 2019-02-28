/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.ProductDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.ProductQuery;
import com.happy.service.main.converter.ProductConverter;
import com.happy.service.main.dao.ProductMapper;
import com.happy.service.main.po.Product;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月9日 上午10:54:32
 */
@Service
public class ProductBL {
	@Autowired
	private ProductMapper productMapper;
	
	public void insertProductDTO(ProductDTO dto) {
		Product product = ProductConverter.toProduct(dto);
		productMapper.insertProduct(product);
	}
	
	public void deleteProductDTO(Long id) {
		productMapper.deleteProduct(id);
	}
	
	public void updateProductDTO(ProductDTO dto) {
		Product product = ProductConverter.toProduct(dto);
		productMapper.updateProduct(product);
	}
	
	public PageList<ProductDTO> listProductDTO(ProductQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<Product> listProduct = productMapper.listProduct(query);
		PageList<ProductDTO> pageList = new PageList<>();
		Long total = listProduct.getTotal();
		List<ProductDTO> productDTOList = ProductConverter.toProductDTOList(listProduct);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(productDTOList);
		pageList.setPager(pager);
		return pageList;
	}
	
	public Map<Long, ProductDTO> getMapByproductIdSet(Set<Long> idSet) {
		Map<Long, ProductDTO> map = new HashMap<>();
		idSet.forEach(id -> {
			Product product = productMapper.getByProductId(id);
			ProductDTO productDTO = ProductConverter.toProductDTO(product);
			map.put(id, productDTO);
		});
		return map;
	}
}

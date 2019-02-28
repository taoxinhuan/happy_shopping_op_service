/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.ProductDTO;
import com.happy.service.main.po.Product;

/**
 * @description :商品转换类
 * @author taoxinhuan
 * @date 2018年11月8日 下午4:19:31
 */
public class ProductConverter {
	public static ProductDTO toProductDTO(Product po) {
		if (null != po) {
			ProductDTO dto = new ProductDTO();
			dto.setId(po.getId());
			dto.setImgurl(po.getImgurl());
			dto.setName(po.getName());
			dto.setProductType(po.getProductType());
			dto.setShopId(po.getShopId());
			dto.setState(po.getState());
			return dto;
		}
		return null;
	}
	
	public static Product toProduct(ProductDTO dto) {
		if (null != dto) {
			Product po = new Product();
			po.setId(dto.getId());
			po.setImgurl(dto.getImgurl());
			po.setName(dto.getName());
			po.setProductType(dto.getProductType());
			po.setShopId(dto.getShopId());
			po.setState(dto.getState());
			return po;
		}
		return null;
	}
	
	public static List<ProductDTO> toProductDTOList(List<Product> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<ProductDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				ProductDTO dto = toProductDTO(po);
				dtoList.add(dto);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<Product> toProductList(List<ProductDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<Product> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				Product po = toProduct(dto);
				poList.add(po);
			});
			return poList;
		}
		return null;
	}
}

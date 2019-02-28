/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.ProductSkuDTO;
import com.happy.service.main.po.ProductSku;

/**
 * @description：商品规格转换类
 * @author taoxinhuan
 * @date 2018年11月8日 下午4:39:11
 */
public class ProductSkuConverter {
	public static ProductSkuDTO toProductSkuDTO(ProductSku po) {
		if (null != po) {
			ProductSkuDTO dto = new ProductSkuDTO();
			dto.setId(po.getId());
			dto.setProductId(po.getProductId());
			dto.setShopId(po.getShopId());
			dto.setSkuCount(po.getSkuCount());
			dto.setSkuName(po.getSkuName());
			dto.setSkuPrice(po.getSkuPrice());
			dto.setSkuSpec(po.getSkuSpec());
			dto.setState(po.getState());
			return dto;
		}
		return null;
	}
	
	public static ProductSku toProductSku(ProductSkuDTO dto) {
		if (null != dto) {
			ProductSku po = new ProductSku();
			po.setId(dto.getId());
			po.setProductId(dto.getProductId());
			po.setShopId(dto.getShopId());
			po.setSkuCount(dto.getSkuCount());
			po.setSkuName(dto.getSkuName());
			po.setSkuPrice(dto.getSkuPrice());
			po.setSkuSpec(dto.getSkuSpec());
			po.setState(dto.getState());
			return po;
		}
		return null;
	}
	
	public static List<ProductSkuDTO> toProductSkuDTOList(List<ProductSku> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<ProductSkuDTO> dtoList = new ArrayList<>();
			poList.forEach(po -> {
				ProductSkuDTO dto = toProductSkuDTO(po);
				dtoList.add(dto);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<ProductSku> toProductSkuList(List<ProductSkuDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<ProductSku> poList = new ArrayList<>();
			dtoList.forEach(dto -> {
				ProductSku po = toProductSku(dto);
				poList.add(po);
			});
			return poList;
		}
		return null;
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import java.util.Map;
import java.util.Set;

import com.happy.core.dto.ProductDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.ProductQuery;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午11:20:02
 */
public interface ProductService {
	/**
	 * @description:新增商品
	 * @param dto
	 * @return
	 * @return int
	 */
	void insertProductDTO(ProductDTO dto);
	
	/**
	 * @description :删除商品
	 * @param id
	 * @return
	 * @return int
	 */
	void deleteProductDTO(Long id);
	
	/**
	 * @description:跟新商品
	 * @param dto
	 * @return
	 * @return int
	 */
	void updateProductDTO(ProductDTO dto);
	
	/**
	 * @description:分页查询商品
	 * @param query
	 * @return
	 * @return Page<ProductDTO>
	 */
	PageList<ProductDTO> listProductDTO(ProductQuery query);
	
	/**
	 * @description :根据Idset查询商品
	 * @param idSet
	 * @return
	 * @return Map<Long,ProductDTO>
	 */
	Map<Long, ProductDTO> getMapByproductIdSet(Set<Long> idSet);
}

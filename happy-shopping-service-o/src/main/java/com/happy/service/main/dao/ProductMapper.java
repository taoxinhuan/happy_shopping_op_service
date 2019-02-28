package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.ProductQuery;
import com.happy.service.main.po.Product;

public interface ProductMapper {
	/**
	 * @description:新增商品
	 * @param po
	 * @return
	 * @return int
	 */
	void insertProduct(@Param("po") Product po);
	
	/**
	 * @description :删除商品
	 * @param id
	 * @return
	 * @return int
	 */
	void deleteProduct(Long id);
	
	/**
	 * @description:跟新商品
	 * @param po
	 * @return
	 * @return int
	 */
	void updateProduct(@Param("po") Product po);
	
	/**
	 * @description:分页查询商品
	 * @param query
	 * @return
	 * @return Page<Product>
	 */
	Page<Product> listProduct(@Param("query") ProductQuery query);
	
	/**
	 * @description:根据Id查询商品
	 * @param id
	 * @return
	 * @return Product
	 */
	Product getByProductId(Long id);
}

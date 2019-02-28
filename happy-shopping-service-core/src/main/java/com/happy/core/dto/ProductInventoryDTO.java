/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;

/**
 * @description：商品库存DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:28:25
 */
public class ProductInventoryDTO implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 店铺Id
	 */
	private Long shopId;
	
	/**
	 * 产品Id
	 */
	private Long productId;
	
	/**
	 * 库存数量
	 */
	private Integer count;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getShopId() {
		return shopId;
	}
	
	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	public Long getProductId() {
		return productId;
	}
	
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "ProductInventoryDTO [id=" + id + ", shopId=" + shopId + ", productId=" + productId + ", count=" + count
				+ "]";
	}
}

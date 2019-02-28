/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;

/**
 * @description：订单项DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:27:14
 */
public class OrderItemDTO implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 订单ID
	 */
	private Long orderId;
	
	/**
	 * 商品Id
	 */
	private Long productId;
	
	/**
	 * 商品规格ID
	 */
	private Long productSkuId;
	
	/**
	 * 数量
	 */
	private Integer productCount;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public Long getProductId() {
		return productId;
	}
	
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	
	public Long getProductSkuId() {
		return productSkuId;
	}
	
	public void setProductSkuId(Long productSkuId) {
		this.productSkuId = productSkuId;
	}
	
	public Integer getProductCount() {
		return productCount;
	}
	
	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	
	@Override
	public String toString() {
		return "OrderItemDTO [id=" + id + ", orderId=" + orderId + ", productId=" + productId + ", productSkuId="
				+ productSkuId + ", productCount=" + productCount + "]";
	}
}

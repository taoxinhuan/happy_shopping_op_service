/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;

/**
 * @description：购物车DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:33:26
 */
public class UserShoppingcartDTO implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 用户ID
	 */
	private Long userId;
	
	/**
	 * 商品ID
	 */
	private Long productId;
	
	/**
	 * 商品规格Id
	 */
	private Long productSkuId;
	
	/**
	 * 数量
	 */
	private Integer count;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
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
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "UserShoppingcartDTO [id=" + id + ", userId=" + userId + ", productId=" + productId + ", productSkuId="
				+ productSkuId + ", count=" + count + "]";
	}
}

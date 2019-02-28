/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.po;

import java.util.Date;

/**
 * @description：订单项PO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:27:14
 */
public class OrderItem {
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
	
	/**
	 * 创建人-用户
	 */
	private Long createUserId;
	
	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 最近更新人
	 */
	private Long lastUpdateUserId;
	
	/**
	 * 最近更新时间
	 */
	private Date lastUpdateTime;
	
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
	
	public Long getCreateUserId() {
		return createUserId;
	}
	
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Long getLastUpdateUserId() {
		return lastUpdateUserId;
	}
	
	public void setLastUpdateUserId(Long lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId;
	}
	
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
}

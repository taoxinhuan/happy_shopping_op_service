/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.po;

import java.util.Date;

/**
 * @description：商品库存PO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:28:25
 */
public class ProductInventory {
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

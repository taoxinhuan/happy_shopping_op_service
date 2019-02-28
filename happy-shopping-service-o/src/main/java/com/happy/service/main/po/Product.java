/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.po;

import java.util.Date;

/**
 * @description：商品PO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:28:08
 */
public class Product {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 店鋪id
	 */
	private Long shopId;
	
	/**
	 * 店铺名称
	 */
	private String name;
	
	/**
	 * 产品类型
	 */
	private Integer productType;
	
	/**
	 * 状态 @see StateEnum
	 */
	private Integer state;
	
	/**
	 * 图片地址
	 */
	private String imgurl;
	
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	
	public Integer getProductType() {
		return productType;
	}
	
	public void setProductType(Integer productType) {
		this.productType = productType;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	public String getImgurl() {
		return imgurl;
	}
	
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl == null ? null : imgurl.trim();
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

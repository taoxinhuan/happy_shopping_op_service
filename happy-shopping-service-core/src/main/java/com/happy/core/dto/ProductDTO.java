/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;

/**
 * @description：商品DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:28:08
 */
public class ProductDTO implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 店鋪id
	 */
	private Long shopId;
	
	/**
	 * 商品名称
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
	
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", shopId=" + shopId + ", name=" + name + ", productType=" + productType
				+ ", state=" + state + ", imgurl=" + imgurl + "]";
	}
}

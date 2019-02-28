/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description：商品Sku（规格）DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:28:45
 */
public class ProductSkuDTO implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 店铺id
	 */
	private Long shopId;
	
	/**
	 * 商品Id
	 */
	private Integer productId;
	
	/**
	 * 产品规格名称
	 */
	private String skuName;
	
	/**
	 * 产品规格
	 */
	private String skuSpec;
	
	/**
	 * 产品规格数量
	 */
	private String skuCount;
	
	/**
	 * 产品规格价格
	 */
	private BigDecimal skuPrice;
	
	/**
	 * 状态 @see StateEnum
	 */
	private Integer state;
	
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
	
	public Integer getProductId() {
		return productId;
	}
	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	public String getSkuName() {
		return skuName;
	}
	
	public void setSkuName(String skuName) {
		this.skuName = skuName == null ? null : skuName.trim();
	}
	
	public String getSkuSpec() {
		return skuSpec;
	}
	
	public void setSkuSpec(String skuSpec) {
		this.skuSpec = skuSpec == null ? null : skuSpec.trim();
	}
	
	public String getSkuCount() {
		return skuCount;
	}
	
	public void setSkuCount(String skuCount) {
		this.skuCount = skuCount == null ? null : skuCount.trim();
	}
	
	public BigDecimal getSkuPrice() {
		return skuPrice;
	}
	
	public void setSkuPrice(BigDecimal skuPrice) {
		this.skuPrice = skuPrice;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "ProductSkuDTO [id=" + id + ", shopId=" + shopId + ", productId=" + productId + ", skuName=" + skuName
				+ ", skuSpec=" + skuSpec + ", skuCount=" + skuCount + ", skuPrice=" + skuPrice + ", state=" + state
				+ "]";
	}
}

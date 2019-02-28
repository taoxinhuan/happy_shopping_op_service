/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.query;

import java.io.Serializable;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午10:10:34
 */
public class ProductInventoryQuery implements Serializable {
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
	 * 页码
	 */
	private Integer pageIndex;
	
	/**
	 * 页面数据量
	 */
	private Integer pageSize;
	
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
	
	public Integer getPageIndex() {
		return pageIndex;
	}
	
	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}
	
	public Integer getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}

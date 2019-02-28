/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.query;

import java.io.Serializable;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午10:10:49
 */
public class ProductSkuQuery implements Serializable {
	/**
	 * 商品Id
	 */
	private Integer productId;
	
	/**
	 * 页码
	 */
	private Integer pageIndex;
	
	/**
	 * 页面数据量
	 */
	private Integer pageSize;
	
	public Integer getProductId() {
		return productId;
	}
	
	public void setProductId(Integer productId) {
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

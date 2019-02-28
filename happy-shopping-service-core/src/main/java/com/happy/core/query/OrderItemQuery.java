/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.query;

import java.io.Serializable;

/**
 * @description:订单项查询对象
 * @author taoxinhuan
 * @date 2018年11月7日 下午12:04:11
 */
public class OrderItemQuery implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 订单ID
	 */
	private Long orderId;
	
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
	
	public Long getOrderId() {
		return orderId;
	}
	
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
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

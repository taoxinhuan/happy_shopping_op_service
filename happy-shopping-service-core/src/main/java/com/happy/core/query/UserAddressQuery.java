/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.query;

import java.io.Serializable;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午9:16:19
 */
public class UserAddressQuery implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 用户Id
	 */
	private Long userId;
	
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
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
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

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.query;

import java.io.Serializable;

/**
 * @description :用户查询对象
 * @author taoxinhuan
 * @date 2018年11月7日 下午1:49:05
 */
public class UserQuery implements Serializable {
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 用户类型 @see UserTypeEnum
	 */
	private Integer type;
	
	/**
	 * 状态 @see StateEnum
	 */
	private Integer state;
	
	/**
	 * 页码
	 */
	private Integer pageIndex;
	
	/**
	 * 页面数据量
	 */
	private Integer pageSize;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
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
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
}

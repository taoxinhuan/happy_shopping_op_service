/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.query;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月8日 上午10:11:03
 */
public class ShopQuery implements Serializable {
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 店主名
	 */
	private String keeperName;
	
	private String mobile;
	
	/**
	 * 状态 @see StateEnum
	 */
	private Integer state;
	
	private Date createTime;
	
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
	
	public String getKeeperName() {
		return keeperName;
	}
	
	public void setKeeperName(String keeperName) {
		this.keeperName = keeperName;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
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
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}

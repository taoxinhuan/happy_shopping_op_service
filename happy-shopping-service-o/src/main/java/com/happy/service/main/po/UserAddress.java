package com.happy.service.main.po;

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
import java.util.Date;

/**
 * @description：用户收获地址PO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:44:17
 */
public class UserAddress {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 用户Id
	 */
	private Long userId;
	
	/**
	 * 省
	 */
	private String province;
	
	/**
	 * 市
	 */
	private String city;
	
	/**
	 * 区县
	 */
	private String county;
	
	/**
	 * 街道
	 */
	private String street;
	
	/**
	 * 地址
	 */
	private String address;
	
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
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public String getProvince() {
		return province;
	}
	
	public void setProvince(String province) {
		this.province = province == null ? null : province.trim();
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city == null ? null : city.trim();
	}
	
	public String getCounty() {
		return county;
	}
	
	public void setCounty(String county) {
		this.county = county == null ? null : county.trim();
	}
	
	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street == null ? null : street.trim();
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
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

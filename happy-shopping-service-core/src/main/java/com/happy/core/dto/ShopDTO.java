/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：店铺DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:29:40
 */
public class ShopDTO implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 名称
	 */
	private String name;
	
	/**
	 * 店主Id
	 */
	private Long keeperId;
	
	/**
	 * 地址
	 */
	private String address;
	
	/**
	 * 经度
	 */
	private String longitude;
	
	/**
	 * 纬度
	 */
	private String latitude;
	
	/**
	 * 状态 @see StateEnum
	 */
	private Integer state;
	
	private String keeperName;
	
	private String mobile;
	
	private Date createTime;
	
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
	
	public Long getKeeperId() {
		return keeperId;
	}
	
	public void setKeeperId(Long keeperId) {
		this.keeperId = keeperId;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude == null ? null : longitude.trim();
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude == null ? null : latitude.trim();
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
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
	
	@Override
	public String toString() {
		return "ShopDTO [id=" + id + ", name=" + name + ", keeperId=" + keeperId + ", address=" + address
				+ ", longitude=" + longitude + ", latitude=" + latitude + ", state=" + state + ", keeperName="
				+ keeperName + ", mobile=" + mobile + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getKeeperId()=" + getKeeperId() + ", getAddress()=" + getAddress() + ", getLongitude()="
				+ getLongitude() + ", getLatitude()=" + getLatitude() + ", getState()=" + getState()
				+ ", getKeeperName()=" + getKeeperName() + ", getMobile()=" + getMobile() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}

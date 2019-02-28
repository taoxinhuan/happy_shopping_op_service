package com.happy.core.dto;

import java.io.Serializable;

/**
 * @description：用户收获地址DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:44:17
 */
public class UserAddressDTO implements Serializable {
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
	
	@Override
	public String toString() {
		return "UserAddressDTO [id=" + id + ", userId=" + userId + ", province=" + province + ", city=" + city
				+ ", county=" + county + ", street=" + street + ", address=" + address + "]";
	}
}

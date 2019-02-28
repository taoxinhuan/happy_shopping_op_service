/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;

/**
 * @description：订单DTO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:25:25
 */
public class OrderDTO implements Serializable {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 订单状态
	 */
	private Integer state;
	
	/**
	 * 订单金额
	 */
	private Float amount;
	
	/**
	 * 用户ID
	 */
	private Long userId;
	
	/**
	 * 用户收获地址Id
	 */
	private Long userAddressId;
	
	/**
	 * 用户购物车ID（不是从购物陈中付款就没有）
	 */
	private Long userShoppingCartId;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	public Float getAmount() {
		return amount;
	}
	
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getUserAddressId() {
		return userAddressId;
	}
	
	public void setUserAddressId(Long userAddressId) {
		this.userAddressId = userAddressId;
	}
	
	public Long getUserShoppingCartId() {
		return userShoppingCartId;
	}
	
	public void setUserShoppingCartId(Long userShoppingCartId) {
		this.userShoppingCartId = userShoppingCartId;
	}
	
	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", state=" + state + ", amount=" + amount + ", userId=" + userId
				+ ", userAddressId=" + userAddressId + ", userShoppingCartId=" + userShoppingCartId + "]";
	}
}

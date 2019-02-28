/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.po;

import java.util.Date;

/**
 * @description：订单PO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:25:25
 */
public class Order {
	/**
	 * id
	 */
	private Long id;
	
	/**
	 * 订单状态 @see OrderStateEnum
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

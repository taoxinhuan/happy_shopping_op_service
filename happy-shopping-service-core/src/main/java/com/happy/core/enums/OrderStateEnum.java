/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.enums;

/**
 * @description :订单状态枚举
 * @author taoxinhuan
 * @date 2018年11月7日 下午1:36:46
 */
public enum OrderStateEnum {
	/**
	 * 待支付
	 */
	WAIT_FOR_PAY(0, "待支付"),
	/**
	 * 已支付
	 */
	HAS_BEEN_PAID(1, "已支付"),
	/**
	 * 已取消
	 */
	HAS_BEEN_DROPED(1, "已取消");
	private int key;
	
	private String value;
	
	private OrderStateEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.enums;

/**
 * @description:状态枚举
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:46:32
 */
public enum StateEnum {
	/**
	 * 0代表使用中
	 */
	IN_USE(0, "使用中"),
	/**
	 * 1代表停用中
	 */
	OUT_OF_USE(1, "停用中");
	private int key;
	
	private String value;
	
	private StateEnum(int key, String value) {
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

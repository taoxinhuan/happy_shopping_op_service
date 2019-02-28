/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.enums;

/**
 * @description:用户类型枚举
 * @author taoxinhuan
 * @date 2018年11月7日 上午11:00:41
 */
public enum UserTypeEnum {
	/**
	 * 0代表管理员
	 */
	MANAGER(0, "管理员"),
	/**
	 * 1代表店主
	 */
	SHOP_KEEPER(1, "店主"),
	/**
	 * 2代表一般用户
	 */
	COMMEN_USER(2, "一般用户");
	private int key;
	
	private String value;
	
	private UserTypeEnum(int key, String value) {
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

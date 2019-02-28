/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：用户PO
 * @author taoxinhuan
 * @date 2018年11月7日 上午10:29:53
 */
public class UserDTO implements Serializable {
	/**
	 * 用户Id
	 */
	private Long id;
	
	/**
	 * 真实名称
	 */
	private String realname;
	
	/**
	 * 昵称
	 */
	private String nickname;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 密码
	 */
	private String password;
	
	/**
	 * 用户类型 @see UserTypeEnum
	 */
	private Integer type;
	
	/**
	 * 状态 @see StateEnum
	 */
	private Integer state;
	
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
	
	public String getRealname() {
		return realname;
	}
	
	public void setRealname(String realname) {
		this.realname = realname == null ? null : realname.trim();
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname == null ? null : nickname.trim();
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}
	
	public Integer getType() {
		return type;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getState() {
		return state;
	}
	
	public void setState(Integer state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", realname=" + realname + ", nickname=" + nickname + ", mobile=" + mobile
				+ ", password=" + password + ", type=" + type + ", state=" + state + "]";
	}
}

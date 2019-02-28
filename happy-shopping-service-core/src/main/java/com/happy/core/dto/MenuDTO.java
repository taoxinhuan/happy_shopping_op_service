/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午10:53:42
 */
public class MenuDTO implements Serializable {
	private Long id;
	
	private String privilegeType;
	
	private String privilegeName;
	
	private String title;
	
	private String url;
	
	private String icon;
	
	private Long parentId;
	
	private String sequence;
	
	private List<MenuDTO> sonMenu;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getPrivilegeType() {
		return privilegeType;
	}
	
	public void setPrivilegeType(String privilegeType) {
		this.privilegeType = privilegeType;
	}
	
	public String getPrivilegeName() {
		return privilegeName;
	}
	
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	public Long getParentId() {
		return parentId;
	}
	
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	
	public String getSequence() {
		return sequence;
	}
	
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	public List<MenuDTO> getSonMenu() {
		return sonMenu;
	}
	
	public void setSonMenu(List<MenuDTO> sonMenu) {
		this.sonMenu = sonMenu;
	}
	
	@Override
	public String toString() {
		return "MenuDTO [id=" + id + ", privilegeType=" + privilegeType + ", privilegeName=" + privilegeName
				+ ", title=" + title + ", url=" + url + ", icon=" + icon + ", parentId=" + parentId + ", sequence="
				+ sequence + ", sonMenu=" + sonMenu + "]";
	}
}

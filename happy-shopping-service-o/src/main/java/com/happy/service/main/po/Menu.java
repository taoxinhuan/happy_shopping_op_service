package com.happy.service.main.po;

import java.util.Date;

/**
 * @description :菜单
 * @author taoxinhuan
 * @date 2018年11月17日 上午11:50:07
 */
public class Menu {
	private Long id;
	
	private String privilegeType;
	
	private String privilegeName;
	
	private String title;
	
	private String url;
	
	private String icon;
	
	private Long parentId;
	
	private String sequence;
	
	private Long createUserId;
	
	private Date createTime;
	
	private Long lastUpdateUserId;
	
	private Date lastUpdateTime;
	
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
		this.privilegeName = privilegeName == null ? null : privilegeName.trim();
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}
	
	public String getIcon() {
		return icon;
	}
	
	public void setIcon(String icon) {
		this.icon = icon == null ? null : icon.trim();
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
		this.sequence = sequence == null ? null : sequence.trim();
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

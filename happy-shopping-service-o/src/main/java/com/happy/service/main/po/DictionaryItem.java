package com.happy.service.main.po;

/**
 * @description :字典项PO
 * @author taoxinhuan
 * @date 2018年11月17日 上午11:49:49
 */
public class DictionaryItem {
	private Long id;
	
	private String key;
	
	private String value;
	
	private String sequence;
	
	private Long parentId;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getSequence() {
		return sequence;
	}
	
	public void setSequence(String sequence) {
		this.sequence = sequence == null ? null : sequence.trim();
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public Long getParentId() {
		return parentId;
	}
	
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午10:52:16
 */
public class DictionaryDTO implements Serializable {
	private Long id;
	
	private String name;
	
	private String code;
	
	private String sequence;
	
	private List<DictionaryItemDTO> itemList;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSequence() {
		return sequence;
	}
	
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public List<DictionaryItemDTO> getItemList() {
		return itemList;
	}
	
	public void setItemList(List<DictionaryItemDTO> itemList) {
		this.itemList = itemList;
	}
}

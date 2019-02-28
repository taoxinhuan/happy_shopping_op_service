/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.DictionaryItemDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.DictionaryItemQuery;
import com.happy.core.service.DictionaryItemService;
import com.happy.service.main.bl.DictionaryItemBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:21:57
 */
@Service
public class DictionaryItemServiceImpl implements DictionaryItemService {
	@Autowired
	private DictionaryItemBL dictionaryItemBL;
	
	@Override
	public void deleteDictionaryItem(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		dictionaryItemBL.deleteDictionaryItem(id);
	}
	
	@Override
	public void insertDictionaryItem(DictionaryItemDTO dictionaryItemDTO) {
		AssertUtils.notNull(dictionaryItemDTO, "dto不能为空");
		dictionaryItemBL.insertDictionaryItem(dictionaryItemDTO);
	}
	
	@Override
	public void updateDictionaryItem(DictionaryItemDTO dictionaryItemDTO) {
		AssertUtils.notNull(dictionaryItemDTO, "dto不能为空");
		dictionaryItemBL.updateDictionaryItem(dictionaryItemDTO);
	}
	
	@Override
	public PageList<DictionaryItemDTO> listDictionaryItem(DictionaryItemQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return dictionaryItemBL.listDictionaryItem(query);
	}
}

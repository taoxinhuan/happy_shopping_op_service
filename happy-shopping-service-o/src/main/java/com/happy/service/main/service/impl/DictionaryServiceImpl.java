/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.happy.core.dto.DictionaryDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.DictionaryQuery;
import com.happy.core.service.DictionaryService;
import com.happy.service.main.bl.DictionaryBL;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:21:07
 */
@Service
public class DictionaryServiceImpl implements DictionaryService {
	@Autowired
	private DictionaryBL dictionaryBL;
	
	@Override
	public void deleteDictionary(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		dictionaryBL.deleteDictionary(id);
	}
	
	@Override
	public void insertDictionary(DictionaryDTO dto) {
		AssertUtils.notNull(dto, "dto不能为空");
		AssertUtils.notNull(dto.getCode(), "code不能为空");
		dictionaryBL.insertDictionary(dto);
	}
	
	@Override
	public void updateDictionary(DictionaryDTO dto) {
		AssertUtils.notNull(dto, "dto不能为空");
		AssertUtils.notNull(dto.getCode(), "code不能为空");
		dictionaryBL.updateDictionary(dto);
	}
	
	@Override
	public PageList<DictionaryDTO> listDictionary(DictionaryQuery query) {
		AssertUtils.notNull(query, "查询对象不能为空");
		AssertUtils.notNull(query.getPageIndex(), "页码不能为空");
		AssertUtils.notNull(query.getPageSize(), "页面容量不能为空");
		return dictionaryBL.listDictionary(query);
	}
	
	@Override
	public DictionaryDTO getDictionaryById(Long id) {
		AssertUtils.notNull(id, "id不能为空");
		return dictionaryBL.getDictionaryById(id);
	}
	
	@Override
	public DictionaryDTO getDictionaryByCode(String code) {
		AssertUtils.notNull(code, "code不能为空");
		return dictionaryBL.getDictionaryByCode(code);
	}
}

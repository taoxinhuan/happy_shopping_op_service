/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.DictionaryItemDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.DictionaryItemQuery;
import com.happy.service.main.converter.DictionaryItemConverter;
import com.happy.service.main.dao.DictionaryItemMapper;
import com.happy.service.main.po.DictionaryItem;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:23:17
 */
@Service
public class DictionaryItemBL {
	@Autowired
	private DictionaryItemMapper dictionaryItemMapper;
	
	public void deleteDictionaryItem(Long id) {
		dictionaryItemMapper.deleteDictionaryItem(id);
	}
	
	public void insertDictionaryItem(DictionaryItemDTO dictionaryItemDTO) {
		DictionaryItem dictionaryItem = DictionaryItemConverter.toDictionaryItem(dictionaryItemDTO);
		dictionaryItemMapper.insertDictionaryItem(dictionaryItem);
	}
	
	public void updateDictionaryItem(DictionaryItemDTO dictionaryItemDTO) {
		DictionaryItem dictionaryItem = DictionaryItemConverter.toDictionaryItem(dictionaryItemDTO);
		dictionaryItemMapper.updateDictionaryItem(dictionaryItem);
	}
	
	public PageList<DictionaryItemDTO> listDictionaryItem(DictionaryItemQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<DictionaryItem> listDictionaryItem = dictionaryItemMapper.listDictionaryItem(query);
		PageList<DictionaryItemDTO> pageList = new PageList<>();
		Long total = listDictionaryItem.getTotal();
		List<DictionaryItemDTO> listDictionaryItemDTOList = DictionaryItemConverter
				.toDictionaryItemDTOList(listDictionaryItem);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(listDictionaryItemDTOList);
		pageList.setPager(pager);
		return pageList;
	}
}

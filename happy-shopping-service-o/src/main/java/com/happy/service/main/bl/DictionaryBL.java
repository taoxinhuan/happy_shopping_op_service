/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.bl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.happy.core.dto.DictionaryDTO;
import com.happy.core.dto.DictionaryItemDTO;
import com.happy.core.page.PageList;
import com.happy.core.page.Pager;
import com.happy.core.query.DictionaryQuery;
import com.happy.service.main.converter.DictionaryConverter;
import com.happy.service.main.converter.DictionaryItemConverter;
import com.happy.service.main.dao.DictionaryItemMapper;
import com.happy.service.main.dao.DictionaryMapper;
import com.happy.service.main.po.Dictionary;
import com.happy.service.main.po.DictionaryItem;
import com.happy.service.main.util.AssertUtils;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:23:00
 */
@Service
public class DictionaryBL {
	@Autowired
	private DictionaryMapper dictionaryMapper;
	
	@Autowired
	private DictionaryItemMapper dictionaryItemMapper;
	
	public void deleteDictionary(Long id) {
		dictionaryMapper.deleteDictionary(id);
	}
	
	public void insertDictionary(DictionaryDTO dto) {
		Dictionary dictionary = DictionaryConverter.toDictionary(dto);
		String code = dto.getCode();
		DictionaryDTO dictionaryByCode = getDictionaryByCode(code);
		AssertUtils.isNull(dictionaryByCode, "已存在此字典代码");
		dictionaryMapper.insertDictionary(dictionary);
	}
	
	public void updateDictionary(DictionaryDTO dto) {
		Dictionary dictionary = DictionaryConverter.toDictionary(dto);
		String code = dto.getCode();
		DictionaryDTO dictionaryByCode = getDictionaryByCode(code);
		AssertUtils.isNull(dictionaryByCode, "已存在此字典代码");
		dictionaryMapper.updateDictionary(dictionary);
	}
	
	public PageList<DictionaryDTO> listDictionary(DictionaryQuery query) {
		Integer pageIndex = query.getPageIndex();
		Integer pageSize = query.getPageSize();
		PageHelper.startPage(pageIndex, pageSize);
		Page<Dictionary> listDictionary = dictionaryMapper.listDictionary(query);
		PageList<DictionaryDTO> pageList = new PageList<>();
		Long total = listDictionary.getTotal();
		List<DictionaryDTO> listDictionaryDTOList = DictionaryConverter.toDictionaryDTOList(listDictionary);
		Pager pager = new Pager(pageIndex, pageSize, total.intValue());
		pageList.setDataList(listDictionaryDTOList);
		pageList.setPager(pager);
		return pageList;
	}
	
	/**
	 * @description
	 * @param id
	 * @return void
	 */
	public DictionaryDTO getDictionaryById(Long id) {
		Dictionary dictionary = dictionaryMapper.getDictionaryById(id);
		DictionaryDTO dictionaryDTO = DictionaryConverter.toDictionaryDTO(dictionary);
		return dictionaryDTO;
	}
	
	/**
	 * @description
	 * @param code
	 * @return
	 * @return DictionaryDTO
	 */
	public DictionaryDTO getDictionaryByCode(String code) {
		Dictionary dictionary = dictionaryMapper.getDictionaryByCode(code);
		DictionaryDTO dictionaryDTO = DictionaryConverter.toDictionaryDTO(dictionary);
		Long pid = dictionaryDTO.getId();
		List<DictionaryItem> listDictionaryItemList = dictionaryItemMapper.listDictionaryItemByPid(pid);
		List<DictionaryItemDTO> dictionaryItemDTOList = DictionaryItemConverter
				.toDictionaryItemDTOList(listDictionaryItemList);
		dictionaryDTO.setItemList(dictionaryItemDTOList);
		return dictionaryDTO;
	}
}

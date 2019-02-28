package com.happy.service.main.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.DictionaryItemQuery;
import com.happy.service.main.po.DictionaryItem;

public interface DictionaryItemMapper {
	void deleteDictionaryItem(Long id);
	
	void insertDictionaryItem(DictionaryItem dictionaryItem);
	
	void updateDictionaryItem(DictionaryItem dictionaryItem);
	
	Page<DictionaryItem> listDictionaryItem(@Param("query") DictionaryItemQuery query);
	
	List<DictionaryItem> listDictionaryItemByPid(Long pid);
}

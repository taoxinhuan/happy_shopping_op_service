package com.happy.service.main.dao;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.Page;
import com.happy.core.query.DictionaryQuery;
import com.happy.service.main.po.Dictionary;

public interface DictionaryMapper {
	void deleteDictionary(Long id);
	
	void insertDictionary(Dictionary record);
	
	void updateDictionary(Dictionary record);
	
	Page<Dictionary> listDictionary(@Param("query") DictionaryQuery query);
	
	Dictionary getDictionaryById(Long id);
	
	Dictionary getDictionaryByCode(String code);
}

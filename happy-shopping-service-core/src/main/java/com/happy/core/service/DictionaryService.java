/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import com.happy.core.dto.DictionaryDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.DictionaryQuery;

/**
 * @description ：字典
 * @author taoxinhuan
 * @date 2018年11月18日 上午10:47:58
 */
public interface DictionaryService {
	/**
	 * @description:删除字典
	 * @param id
	 * @return void
	 */
	void deleteDictionary(Long id);
	
	/**
	 * @description：插入字典
	 * @param record
	 * @return void
	 */
	void insertDictionary(DictionaryDTO record);
	
	/**
	 * @description：更新字典
	 * @param record
	 * @return void
	 */
	void updateDictionary(DictionaryDTO record);
	
	/**
	 * @description：分页查询字典
	 * @param query
	 * @return
	 * @return PageList<DictionaryDTO>
	 */
	PageList<DictionaryDTO> listDictionary(DictionaryQuery query);
	
	/**
	 * @description：根据ID查询字典信息
	 * @param id
	 * @return
	 * @return DictionaryDTO
	 */
	DictionaryDTO getDictionaryById(Long id);
	
	/**
	 * @description:根据code查询字典详细信息
	 * @param code
	 * @return
	 * @return DictionaryDTO
	 */
	DictionaryDTO getDictionaryByCode(String code);
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.core.service;

import com.happy.core.dto.DictionaryItemDTO;
import com.happy.core.page.PageList;
import com.happy.core.query.DictionaryItemQuery;

/**
 * @description :字典项
 * @author taoxinhuan
 * @date 2018年11月18日 上午10:48:21
 */
public interface DictionaryItemService {
	/**
	 * @description:删除字典项
	 * @param id
	 * @return void
	 */
	void deleteDictionaryItem(Long id);
	
	/**
	 * @description :插入字典项
	 * @param dictionaryItem
	 * @return void
	 */
	void insertDictionaryItem(DictionaryItemDTO dictionaryItem);
	
	/**
	 * @description ：更改字典项
	 * @param dictionaryItem
	 * @return void
	 */
	void updateDictionaryItem(DictionaryItemDTO dictionaryItem);
	
	/**
	 * @description ：分页查询字典项
	 * @param query
	 * @return
	 * @return PageList<DictionaryItemDTO>
	 */
	PageList<DictionaryItemDTO> listDictionaryItem(DictionaryItemQuery query);
}

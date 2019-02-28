/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.DictionaryItemDTO;
import com.happy.service.main.po.DictionaryItem;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:25:05
 */
public class DictionaryItemConverter {
	public static DictionaryItemDTO toDictionaryItemDTO(DictionaryItem po) {
		if (null != po) {
			DictionaryItemDTO dto = new DictionaryItemDTO();
			dto.setId(po.getId());
			dto.setKey(po.getKey());
			dto.setValue(po.getValue());
			dto.setSequence(po.getSequence());
			dto.setParentId(po.getParentId());
			return dto;
		}
		return null;
	}
	
	public static DictionaryItem toDictionaryItem(DictionaryItemDTO dto) {
		if (null != dto) {
			DictionaryItem po = new DictionaryItem();
			po.setId(dto.getId());
			po.setKey(dto.getKey());
			po.setValue(dto.getValue());
			po.setSequence(dto.getSequence());
			po.setParentId(dto.getParentId());
			return po;
		}
		return null;
	}
	
	public static List<DictionaryItemDTO> toDictionaryItemDTOList(List<DictionaryItem> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<DictionaryItemDTO> dtoList = new ArrayList<DictionaryItemDTO>();
			poList.forEach(po -> {
				DictionaryItemDTO DictionaryItemDTO = toDictionaryItemDTO(po);
				dtoList.add(DictionaryItemDTO);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<DictionaryItem> toDictionaryItemList(List<DictionaryItemDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<DictionaryItem> poList = new ArrayList<DictionaryItem>();
			dtoList.forEach(dto -> {
				DictionaryItem DictionaryItem = toDictionaryItem(dto);
				poList.add(DictionaryItem);
			});
			return poList;
		}
		return null;
	}
}

/**   
 * Copyright © 2018 哈皮电子商务有限公司. All rights reserved.
 */
package com.happy.service.main.converter;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.happy.core.dto.DictionaryDTO;
import com.happy.service.main.po.Dictionary;

/**
 * @description
 * @author taoxinhuan
 * @date 2018年11月18日 上午11:28:09
 */
public class DictionaryConverter {
	public static DictionaryDTO toDictionaryDTO(Dictionary po) {
		if (null != po) {
			DictionaryDTO dto = new DictionaryDTO();
			dto.setId(po.getId());
			dto.setName(po.getName());
			dto.setSequence(po.getSequence());
			dto.setCode(po.getCode());
			return dto;
		}
		return null;
	}
	
	public static Dictionary toDictionary(DictionaryDTO dto) {
		if (null != dto) {
			Dictionary po = new Dictionary();
			po.setId(dto.getId());
			po.setName(dto.getName());
			po.setSequence(dto.getSequence());
			po.setCode(dto.getCode());
			return po;
		}
		return null;
	}
	
	public static List<DictionaryDTO> toDictionaryDTOList(List<Dictionary> poList) {
		if (CollectionUtils.isNotEmpty(poList)) {
			List<DictionaryDTO> dtoList = new ArrayList<DictionaryDTO>();
			poList.forEach(po -> {
				DictionaryDTO DictionaryDTO = toDictionaryDTO(po);
				dtoList.add(DictionaryDTO);
			});
			return dtoList;
		}
		return null;
	}
	
	public static List<Dictionary> toDictionaryList(List<DictionaryDTO> dtoList) {
		if (CollectionUtils.isNotEmpty(dtoList)) {
			List<Dictionary> poList = new ArrayList<Dictionary>();
			dtoList.forEach(dto -> {
				Dictionary Dictionary = toDictionary(dto);
				poList.add(Dictionary);
			});
			return poList;
		}
		return null;
	}
}

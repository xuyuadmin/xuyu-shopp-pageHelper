package com.xuyu.service;

import com.xuyu.common.pojo.EUDataGridResult;
import com.xuyu.pojo.TbItem;


public interface ItemService {

	TbItem getItemById(long itemId);
	
	EUDataGridResult getItemList(int page,int rows);
}

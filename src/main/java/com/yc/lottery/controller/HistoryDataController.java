package com.yc.lottery.controller;

import com.yc.lottery.bean.SsqHistoryBlueDataBean;
import com.yc.lottery.service.HistoryDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lottery")
public class HistoryDataController {
	
	@Autowired
	private HistoryDataService historyDataService;
	
	@RequestMapping(value="/query",method = RequestMethod.GET)
	public List<SsqHistoryBlueDataBean> findUsers(){
		return historyDataService.findAllBuleData();
	}
}

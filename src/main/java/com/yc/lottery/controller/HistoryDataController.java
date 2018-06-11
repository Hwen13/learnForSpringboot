package com.yc.lottery.controller;

import com.github.pagehelper.PageHelper;
import com.yc.lottery.bean.SsqHistoryBlueDataBean;
import com.yc.lottery.result.ResponseMessage;
import com.yc.lottery.service.HistoryDataService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Api(value = "HistoryDataController", description = "历史信息")
@RestController
@Validated
@RequestMapping("/lottery")
public class HistoryDataController {
	
	@Autowired
	private HistoryDataService historyDataService;
	@ApiOperation(value="查询信息", notes="查询接口")
	@RequestMapping(value="/query",method = RequestMethod.GET)
	public List<SsqHistoryBlueDataBean> findUsers(int start,int pageSize){
		PageHelper.startPage(start,pageSize);  
		return historyDataService.findAllBuleData();
	}
	
	
	@ApiOperation(value="保存信息", notes="保存接口")
	@RequestMapping(value="/save",method = RequestMethod.PUT)
	public @ResponseBody ResponseMessage insertUsersAction(SsqHistoryBlueDataBean ssqHistoryBlueDataBean){
		ResponseMessage responseMessage = new ResponseMessage();
		int result= historyDataService.insert(ssqHistoryBlueDataBean); 
		responseMessage.setData(result);
		if(result>0){
			responseMessage.setCode(0000);
			responseMessage.setMsg("保存成功");
		}else{
			responseMessage.setCode(9999);
			responseMessage.setMsg("保存失败");
		}
		return responseMessage;
	}
}

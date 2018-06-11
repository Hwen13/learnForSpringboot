package com.yc.lottery.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.yc.lottery.bean.UserBean;
import com.yc.lottery.mapper.UserInfoMapper;
import com.yc.lottery.result.ResponseMessage;
import com.yc.lottery.service.impl.UserInfoServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
/**
 * 查询用户信息接口
 * @author hongwen
 *
 */
@Api(value = "UserController", description = "用户信息")
@RestController
@Validated
@RequestMapping("/user")
public class UserController {
	@Resource 
	private UserInfoServiceImpl userInfoServiceImpl;
	@Autowired
	private UserInfoMapper userInfoMapper;
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/query",method = RequestMethod.GET)
	public List<UserBean> findUsersAction(){
		List<UserBean> list = new ArrayList<>();
		UserBean userBean = new UserBean();
		userBean.setId("q123");
		userBean.setUserName("南京");
		userBean.setPassword("qaz123321");
		list.add(userBean);
		return list;
	}
	/**
	 * 
	 * @param userBean
	 * @return
	 */
	@ApiOperation(value="用户信息", notes="用户信息查询接口")
	@RequestMapping(value="/queryUser",method = RequestMethod.GET)
	public @ResponseBody ResponseMessage findUserAction(UserBean userBean){
		ResponseMessage responseMessage = new ResponseMessage();
		List<UserBean> list = userInfoServiceImpl.queryUserInfo(userBean.getId());
		if(list!=null){
			responseMessage.setData(list);
			responseMessage.setCode(0000);
			responseMessage.setMsg("查询成功");
		}else{
			responseMessage.setCode(9999);
			responseMessage.setMsg("查询失败");
		}
		
		return responseMessage;
	}

	/**
	 * 
	 * @param userBean
	 * @return
	 */
	@ApiOperation(value="所有用户信息", notes="所有用户信息接口")
	@RequestMapping(value="/queryUserAll",method = RequestMethod.GET)
	public @ResponseBody ResponseMessage findUserAllAction(int start,int pageSize){
		ResponseMessage responseMessage = new ResponseMessage();
		PageHelper.startPage(start,pageSize);  
		List<UserBean> list = userInfoServiceImpl.queryUserInfoAll();
		if(list!=null){
			responseMessage.setData(list);
			responseMessage.setCode(0000);
			responseMessage.setMsg("查询成功");
		}else{
			responseMessage.setCode(9999);
			responseMessage.setMsg("查询失败");
		}
		
		return responseMessage;
	}
}

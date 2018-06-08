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

import com.yc.lottery.bean.UserBean;
import com.yc.lottery.result.ResponseMessage;
import com.yc.lottery.service.impl.UserInfoServiceImpl;
/**
 * 查询用户信息接口
 * @author hongwen
 *
 */
@RestController
@Validated
@RequestMapping("/user")
public class UserController {
	@Resource 
	private UserInfoServiceImpl userInfoServiceImpl;
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
	@RequestMapping(value="/queryUser",method = RequestMethod.GET)
	public @ResponseBody ResponseMessage findUserAction(UserBean userBean){
		ResponseMessage responseMessage = new ResponseMessage();
		userBean.setId("123");
		System.out.println("in=========="+userBean.getId());
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

}

package com.yc.lottery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.lottery.bean.UserBean;
import com.yc.lottery.mapper.UserInfoMapper;
import com.yc.lottery.service.UserInfoService;
/**
 * 
 * @author hongwen
 *
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Override
	@Transactional
	public List<UserBean> queryUserInfo(String id) {		
		List<UserBean> listBean = userInfoMapper.queryUserInfo(id);
		return listBean;
	}
	@Override
	@Transactional
	public List<UserBean> queryUserInfoAll() {
		List<UserBean> listBean = userInfoMapper.queryUserInfoAll();
		return listBean;
	}

	
}

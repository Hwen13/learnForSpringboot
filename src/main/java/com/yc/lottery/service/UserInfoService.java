package com.yc.lottery.service;


import java.util.List;

import com.yc.lottery.bean.UserBean;

public interface UserInfoService {
	
	public List<UserBean> queryUserInfo(String id);

}

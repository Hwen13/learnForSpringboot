package com.yc.lottery.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yc.lottery.bean.UserBean;
@Mapper
public interface UserInfoMapper {

	public List<UserBean> queryUserInfo(String id);
}

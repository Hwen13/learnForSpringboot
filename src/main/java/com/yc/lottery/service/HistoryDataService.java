package com.yc.lottery.service;

import com.yc.lottery.bean.SsqHistoryBlueDataBean;

import java.util.List;


public interface HistoryDataService
{
    SsqHistoryBlueDataBean findBlueDataByPrimaryKey(String expect);

    List<SsqHistoryBlueDataBean> findAllBuleData();
}

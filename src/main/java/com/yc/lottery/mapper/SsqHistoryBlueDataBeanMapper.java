package com.yc.lottery.mapper;

import com.yc.lottery.bean.SsqHistoryBlueDataBean;
import java.math.BigDecimal;
import java.util.List;

public interface SsqHistoryBlueDataBeanMapper
{
    int deleteByPrimaryKey(BigDecimal expect);

    int insert(SsqHistoryBlueDataBean record);

    int insertSelective(SsqHistoryBlueDataBean record);

    SsqHistoryBlueDataBean selectByPrimaryKey(BigDecimal expect);

    int updateByPrimaryKeySelective(SsqHistoryBlueDataBean record);

    int updateByPrimaryKey(SsqHistoryBlueDataBean record);

    List<SsqHistoryBlueDataBean> findAllBuleData();
}
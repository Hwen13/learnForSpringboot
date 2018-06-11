
package com.yc.lottery.service.impl;

import com.yc.lottery.bean.SsqHistoryBlueDataBean;
import com.yc.lottery.mapper.SsqHistoryBlueDataBeanMapper;
import com.yc.lottery.service.HistoryDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 * @author cecsm
 * @version 2017年10月19日
 * @see HistoryDataServiceImpl
 * @since
 */

@Service
public class HistoryDataServiceImpl implements HistoryDataService
{
    @Autowired
    private SsqHistoryBlueDataBeanMapper historyBlueDataBeanMapper;

    @Override
    /**
    * findBlueDataByPrimaryKey
    * @author      作者姓名
    * @param expect
    * @return      com.yc.lottery.bean.SsqHistoryBlueDataBean
    * @date        17/2/18 下午9:42
    */
    public SsqHistoryBlueDataBean findBlueDataByPrimaryKey(String expect)
    {
         return historyBlueDataBeanMapper.selectByPrimaryKey(BigDecimal.valueOf(Long.parseLong(expect)));
    }

    /**
    * findAllBuleData
    * @author      yc
    * @return      List
    * @date        17/2/18 下午10:48
    */
    public List<SsqHistoryBlueDataBean> findAllBuleData()
    {
        return historyBlueDataBeanMapper.findAllBuleData();
    }

	@Override
	public int insert(SsqHistoryBlueDataBean ssqHistoryBlueDataBean) {
		int result =historyBlueDataBeanMapper.insert(ssqHistoryBlueDataBean);		
		return result;
	}
}

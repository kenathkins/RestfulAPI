package com.kenat.restful.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kenat.restful.dao.MarketRiskDao;
import com.kenat.restful.entity.MarketRisk;
import com.kenat.restful.service.IMarketRiskService;

@Service
public class MarketRiskServiceImpl implements IMarketRiskService{
	
	@Autowired
	private MarketRiskDao mRiskDao;
	
	@Override
	public MarketRisk queryById(Integer id) {
		// TODO Auto-generated method stub
		return mRiskDao.queryById(id);
	}
	
	@Override
	public List<MarketRisk> queryByStatus(String status) {
		// TODO Auto-generated method stub
		return mRiskDao.queryByStatus(status);
	}
	

	@Transactional
	public int updateStatusById(Integer id, String status) {
		// TODO Auto-generated method stub
		return mRiskDao.updateStatusById(id, status);
	}

}

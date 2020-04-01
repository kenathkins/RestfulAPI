package com.kenat.restful.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kenat.restful.BaseTest;
import com.kenat.restful.entity.MarketRisk;
import com.kenat.restful.service.IMarketRiskService;
import com.kenat.restful.utils.JSONUtil;

public class MarketRiskServiseImplTest extends BaseTest{

	@Autowired
	private IMarketRiskService IMarketRiskService;
	
	@Test
	public void testQueryById() {
		Integer id = 1001;
		System.out.println("Querying for Id " + id);
		MarketRisk mRisk = IMarketRiskService.queryById(id);
		System.out.println(mRisk.toString());
		
//		fail("Not yet implemented");
	}
	
	@Test
	public void testQueryByStatus() {
		List<MarketRisk> mRiskList = IMarketRiskService.queryByStatus("P");
		for (MarketRisk marketRisk : mRiskList) {
			System.out.println(marketRisk);
		}
		
//		fail("Not yet implemented");
	}
	
}

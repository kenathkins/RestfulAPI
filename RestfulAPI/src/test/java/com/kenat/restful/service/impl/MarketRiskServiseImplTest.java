package com.kenat.restful.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kenat.restful.BaseTest;
import com.kenat.restful.dao.MarketRiskDao;
import com.kenat.restful.entity.MarketRisk;
import com.kenat.restful.service.IMarketRiskService;

public class MarketRiskServiseImplTest extends BaseTest{

	@Autowired
	private IMarketRiskService IMarketRiskService;
	
	@Test
	public void testQueryById() {
		Integer id = 1001;
		System.out.println("Querying for Id " + id);
		MarketRisk mRisk = IMarketRiskService.queryById(id);
		System.out.println(mRisk.toString());
		
		fail("Not yet implemented");
	}

}

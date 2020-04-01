package com.kenat.restful.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kenat.restful.BaseTest;
import com.kenat.restful.entity.MarketRisk;

public class MarketRiskDaoTest extends BaseTest{
	
	@Autowired
	private MarketRiskDao mRiskDao;
	
	@Test
	public void testQueryById() {
		Integer id = 1001;
		System.out.println("Querying for Id " + id);
		MarketRisk mRisk = mRiskDao.queryById(id);
		System.out.println(mRisk.toString());
		
//		fail("Not yet implemented");
	}

	@Test
	public void testQueryByStatus() {
		String status = "C";
		System.out.println("Output the entries with status \"C\" : ");
		List<MarketRisk> mRiskList =  mRiskDao.queryByStatus(status);
		for (MarketRisk marketRisk : mRiskList) {
			System.out.println("Current entry = " + marketRisk);
		}
		
//		fail("Not yet implemented");
	}
	
	@Test
	public void testUpdateStatusById() throws Exception{
		Integer id = 1001;
		int res = 0;
		
		res = mRiskDao.updateStatusById(id, "P");
		System.out.println("update status is " + res);
		if (res>0) {
			System.out.println("Update successful");
		}else {
			System.out.println("Update failed");
		}
//		fail("Not yet implemented");
	}
	
}

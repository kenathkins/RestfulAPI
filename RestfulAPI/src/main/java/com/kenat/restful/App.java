package com.kenat.restful;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kenat.restful.entity.MarketRisk;
import com.kenat.restful.service.IMarketRiskService;
import com.kenat.restful.utils.JSONUtil;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		String[] configLocations = new String[]{ "classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"};
		ApplicationContext ac = new ClassPathXmlApplicationContext(configLocations);
		
		IMarketRiskService iMarketRiskService = (IMarketRiskService)ac.getBean(IMarketRiskService.class);
		
		List<MarketRisk> iMarketRisks = iMarketRiskService.queryByStatus("P");
		for (MarketRisk marketRisk : iMarketRisks) {
			System.out.println(JSONUtil.objectToJson(marketRisk));
		}
	}
}

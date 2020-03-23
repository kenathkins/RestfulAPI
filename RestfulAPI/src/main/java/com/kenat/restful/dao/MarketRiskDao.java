/**
 * 
 */
package com.kenat.restful.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kenat.restful.entity.MarketRisk;

/**
 * @author kenat
 *
 */
public interface MarketRiskDao {
	
	MarketRisk queryById(Integer id);

	List<MarketRisk> queryByStatus(String status);
	
	int updateStatusById(@Param("id")Integer id,@Param("status")String status);
	
}

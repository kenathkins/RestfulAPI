package com.kenat.restful.utils;

import java.util.ArrayList;
import java.util.List;

import com.kenat.restful.dto.Result;
import com.kenat.restful.entity.MarketRisk;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSONUtil {
	
	public static String objectToJson(Object obj) {

		String res = "";
		if (obj !=null) {
			res = JSONObject.fromObject(obj).toString();
		}
		return res;
	}
	
	public static <T> String objectToJsonArray(List<Result<T>> results) {

		String res = "";
		if (results.size()>0) {
			res = JSONArray.fromObject(results).toString();
		}
		return res;
	}
	
	public static <E> String listToJSON(List<E> list){
		String res = "";
		if (list.size()>0) {
			res = JSONArray.fromObject(list).toString();
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketRisk mRisk = new MarketRisk();
		mRisk.setId(1);
		mRisk.setStatus("C");
		mRisk.setField1("filed1");
		mRisk.setField2("filed2");
		mRisk.setField3("filed3");
		System.out.println(JSONUtil.objectToJson(mRisk));
		
		List<Result<MarketRisk>> results = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Result<MarketRisk> mResult= new Result<MarketRisk>(true, mRisk);
			results.add(mResult);
		}
		System.out.println(JSONUtil.objectToJsonArray(results));
		System.out.println(JSONUtil.listToJSON(results));
	}
		
		
}

package com.kenat.restful.utils;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.kenat.restful.service.PropertyConstant;

public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {

	@Override
	protected String convertProperty(String propertyName, String propertyValue) {
		if (propertyName.contains(PropertyConstant.JDBC_PASSWORD)){
			propertyValue = propertyValue.substring(0,8);
			System.out.println("Test string is " + propertyValue);
		}
		return propertyValue;
	}
}

package com.kenat.restful;

import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest extends BaseTest{
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void test() {
		logger.trace("======trace"); 
		logger.debug("======debug"); 
		logger.info("======info"); 
		logger.warn("======warn"); 
		logger.error("======error"); 
	}

}

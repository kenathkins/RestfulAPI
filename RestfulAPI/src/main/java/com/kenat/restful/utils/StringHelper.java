package com.kenat.restful.utils;

import java.util.Random;

/**
 * 
 * @author kenat
 *
 */
public final class StringHelper {
	
	
	/**
	 * check if the original string is null if yes, return the default string if
	 * no, just return the value itself
	 * 
	 * @param org
	 * @param dft
	 * @return
	 */
	public static String getDFTStr(String org, String dft) {
		String res = "";
		if (org == null || "".equals(org)) {
			res = dft;
		}else {
			res = org.trim();
		}
		return res;
	}
	
	public static String getVerificationCode(int range) {
		Random random = new Random();
		String res = "";
		for (int i = 0; i < 4; i++) {
			int code = random.nextInt(range);
			res += code;
		}
		return res;
	}
	
	public static void main(String[] args) {
		String code = StringHelper.getVerificationCode(10);
		System.out.println(code);
	}
}

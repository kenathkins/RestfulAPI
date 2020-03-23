package com.kenat.restful.utils;

import java.util.Base64;

public class Base64Util {
	
	
	public static byte[] decryptBASE64(String key) throws Exception{

		return Base64.getDecoder().decode(key);
	}
	
	public static String encryptBASE64(byte[] key) throws Exception{

		return Base64.getEncoder().encodeToString(key);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String test = "kenat515";
		String encrypt = new String(Base64Util.encryptBASE64(test.getBytes()));
		System.out.println("encrypted string is "+ encrypt);
		
		String decrypt = new String(Base64Util.decryptBASE64(encrypt));
		System.out.println("decrypted string is " + decrypt);
	}

}

package com.kenat.restful.utils;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @author kenat
 *
 * 算法/模式/填充						16字节加密后数据长度					不满16字节加密后长度
 * 	AES/CBC/NoPadding					16											不支持
 * 	AES/CBC/PKCS5Padding				32                          					16
 * 	AES/CBC/ISO10126Padding			32                          					16
 * 	AES/CFB/NoPadding					16                          				原始数据长度
 * 	AES/CFB/PKCS5Padding          	32                          					16
 * 	AES/CFB/ISO10126Padding       	32                         					16
 * 	AES/ECB/NoPadding             		16                          				不支持
 * 	AES/ECB/PKCS5Padding          	32                          					16
 * 	AES/ECB/ISO10126Padding       	32                          					16
 * 	AES/OFB/NoPadding             		16                         				原始数据长度
 * 	AES/OFB/PKCS5Padding          	32                          					16
 * 	AES/OFB/ISO10126Padding       	32                          					16
 * 	AES/PCBC/NoPadding            		16                          				不支持
 * 	AES/PCBC/PKCS5Padding      	32                          					16
 * 	AES/PCBC/ISO10126Padding      32                          					16							
 *
 */

public class AESUtil {
	
	public static final String algorithm = "AES";
	// AES/CBC/NOPaddin
	// AES 默认模式
	// 使用CBC模式, 在初始化Cipher对象时, 需要增加参数, 初始化向量IV : IvParameterSpec iv = new
	// IvParameterSpec(key.getBytes());
	// NOPadding: 使用NOPadding模式时, 原文长度必须是8byte的整数倍
	//public static final String transformation = "AES/CBC/NOPadding";
	public static final String AES_CBC_NOPadding = "AES/CBC";
	public static final String AES_CBC_PKCS5Padding = "AES/CBC/PKCS5Padding";
	public static final String key = "1234567812345678";
	
	/***
	 * 加密
	 * @param original 需要加密的参数（注意AES/CBC/NoPadding必须是16位）
	 * @return
	 * @throws Exception
	 */
	public static String encryptByAES(String original) throws Exception {
		// 获取Cipher
		Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5Padding);
		// 生成密钥
		SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), algorithm);
		// 指定模式(加密)和密钥
		// 创建初始化向量
		IvParameterSpec iv = new IvParameterSpec(key.getBytes());
		cipher.init(Cipher.ENCRYPT_MODE, keySpec, iv);
		// cipher.init(Cipher.ENCRYPT_MODE, keySpec);
		
		// 加密
		byte[] bytes = cipher.doFinal(original.getBytes());
		
		return Base64Util.encryptBASE64(bytes);
	}
	
	/**
	 * 解密
	 * @param encrypted 需要解密的参数
	 * @return
	 * @throws Exception
	 */
	public static String decryptByAES(String encrypted) throws Exception {
		
		// 获取Cipher
		Cipher cipher = Cipher.getInstance(AES_CBC_PKCS5Padding);
		// 生成密钥
		SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), algorithm);
		// 指定模式(解密)和密钥
		// 创建初始化向量
		IvParameterSpec iv = new IvParameterSpec(key.getBytes());
		cipher.init(Cipher.DECRYPT_MODE, keySpec, iv);
		// cipher.init(Cipher.DECRYPT_MODE, keySpec);
		// 解密
		byte[] bytes = cipher.doFinal(Base64Util.decryptBASE64(encrypted));
		
		return new String(bytes);
	}
	
	public static void main(String[] args) throws Exception {
		String org = "kenat515";
		String encrypt = AESUtil.encryptByAES(org);
		System.out.println("encrypted string is "+ encrypt);
		
		String decrypt = AESUtil.decryptByAES(encrypt);
		System.out.println("decrypted string is " + decrypt);
		
	}
	
}

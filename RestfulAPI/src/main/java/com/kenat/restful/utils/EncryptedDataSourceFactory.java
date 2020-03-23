package com.kenat.restful.utils;

import java.util.Base64;
import java.util.Properties;

import org.springframework.beans.factory.FactoryBean;

public class EncryptedDataSourceFactory implements FactoryBean<Object> {
	private Properties properties;

	public Object getObject() throws Exception {
		return getProperties();
	}

	public Class<Properties> getObjectType() {
		return java.util.Properties.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties inProperties) {
		this.properties = inProperties;  

		String originalUsername = properties.getProperty("user");  
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("user"));
		
        String originalPassword = properties.getProperty("password");  

        if (originalUsername != null){  
            String newUsername = decryptDESUsername(originalUsername);  
            System.out.println("The new username is " + newUsername);
            properties.put("user", "root");  

        }  

        if (originalPassword != null){  
            String newPassword = decryptDESPassword(originalPassword);  
            System.out.println("The new password is " + newPassword);

            properties.put("password", "kenat515");  

        }  
	}


	private String decryptDESUsername(String originalUsername) {
		
		return decryptDES(originalUsername);
	}

 

	private String decryptDESPassword(String originalPassword) {

		return decryptDES(originalPassword);
	}

 

	/**

	 * 解密

	 * 

	 * @param data

	 *            原始数据

	 * @return 加密后的数据

	 */

	public String decryptDES(String data) {

		try {

			byte[] key = Base64.getDecoder().decode(data);

			return new String(key, "UTF-8");

		} catch (Exception e) {

			e.printStackTrace();

		}

		return null;

	}

 

	/**

	 * 加密

	 * 

	 * @param data

	 *            原始数据

	 * @return 加密后的数据

	 */

	public String encryptDES(String data) {

		try {

			String key = Base64.getEncoder().encodeToString(data.getBytes("UTF-8"));

			return key;

		} catch (Exception e) {

			e.printStackTrace();

		}

		return null;

	}

}
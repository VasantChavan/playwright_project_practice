package com.vittech.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	 private Properties prop;

	    public ConfigReader() {
	        try {
	            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	            prop = new Properties();
	            prop.load(fis);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public String getBaseURL() {
	        return prop.getProperty("baseURL");
	    }

	    public String getBrowser() {
	        return prop.getProperty("browser");
	    }

	    public boolean isHeadless() {
	        return Boolean.parseBoolean(prop.getProperty("headless"));
	    }

	    public int getTimeout() {
	        return Integer.parseInt(prop.getProperty("timeout"));
	    }

	    public String getEnvironment() {
	        return prop.getProperty("environment");
	    }

}

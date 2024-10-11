package com.shopperstack.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class FileLib {

	
	public String getPropertyData(String key) throws IOException {
		 FileInputStream fis=new FileInputStream("./data/testdata1.properties");
		 Properties data=new Properties();
		 data.load(fis);
		 String testdata = data.getProperty(key);
		 return testdata;
		 
		 
	}
	
}


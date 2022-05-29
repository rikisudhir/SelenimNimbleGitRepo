package com.demo.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigParser {
	
	private FileInputStream stream;
	
	private static Properties Configfile= new Properties();
	
	public ConfigParser(String filename) throws IOException {
		
		try {
		
		stream = new FileInputStream(filename);
		
		Configfile.load(stream);
		
		}catch(Exception e) {
			
		   System.out.println(e.getMessage());
		
	}
			
		
	}
	

	public String getPropertyvalue(String attributename) {
		
		return Configfile.getProperty(attributename);
	}
	
	

}

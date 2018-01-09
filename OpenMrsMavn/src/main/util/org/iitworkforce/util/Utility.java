package org.iitworkforce.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static Properties pro;
	
	public static void readPropertyFile( ) throws IOException
	{
	 
		FileInputStream in = new FileInputStream(new File("Object.properties"));
		pro = new Properties();
		pro.load(in);
		System.out.println("Properties file loaded Successfully");
		
	}
}

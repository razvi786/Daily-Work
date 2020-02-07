package com.cts.training.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.attribute.HashAttributeSet;

import java.util.Properties;
import java.util.Set;

public class PropertyExample {

	public static void main(String[] args) throws IOException {

//		FileInputStream fin=new FileInputStream("src/database.properties");
//		
//		Properties props=new Properties();
//		
//		props.load(fin);
//		
//		System.out.println("Server: "+props.getProperty("server"));
//		System.out.println("Port: "+props.getProperty("port"));
//		System.out.println("Username: "+props.getProperty("username"));
//		System.out.println("Password: "+props.getProperty("password"));
//		System.out.println("Database: "+props.getProperty("database"));

		Properties p=System.getProperties();
//		System.out.println(p);
		
		Set<Entry<Object, Object>> entries=p.entrySet();
		
		System.out.println("OS: "+entries.);
		
		for(Entry<Object,Object> e:entries) {
			System.out.println("<"+e.getKey()+" : "+e.getValue()+" >");
		}
		
//		Set set=p.entrySet();
//		
//		for(Object e:set) {
//			System.out.println(e);
//		}
		
	}

}

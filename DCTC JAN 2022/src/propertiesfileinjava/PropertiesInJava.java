package propertiesfileinjava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC JAN 2022\\resource\\test.properties");
		
		Properties p=new Properties();
		p.load(reader);
		
		System.out.println(p.getProperty("baseUrl"));
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
	}

}

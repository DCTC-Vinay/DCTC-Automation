package propertiesinjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\test.properties";
		
		File f=new File(actual_path);
		FileInputStream read=new FileInputStream(f);
		
		Properties p=new Properties();
		p.load(read);
		
		String str=p.getProperty("base_url");
		System.out.println(str);
		
		System.out.println(p.getProperty("uid"));
		System.out.println(p.getProperty("pwd"));
		
		FileOutputStream write=new FileOutputStream(f);
		p.setProperty("uid1", "abs@test.com");
		p.setProperty("pwd1", "12345");
		p.store(write, "Updated on 20.03.2022");
		
	}

}

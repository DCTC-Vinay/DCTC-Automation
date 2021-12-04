package propertiesInJava;

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
		String actual_path=path+"\\Resource\\test.properties";
		
		File f=new File(actual_path);
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties pr=new Properties();
		pr.load(fis);
		
		String value = pr.getProperty("uid");
		System.out.println("User Name:"+value);
		
		String pwd=pr.getProperty("pass");
		System.out.println("Password:"+pwd);
		
		
		FileOutputStream fos=new FileOutputStream(f);
		pr.setProperty("pass", "test@12345");
		pr.store(fos,"updated");
		
		pr.load(fis);
		pwd=pr.getProperty("pass");
		System.out.println("Password:"+pwd);
	}

}

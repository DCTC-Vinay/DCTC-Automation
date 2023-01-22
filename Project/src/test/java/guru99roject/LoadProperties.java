package guru99roject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.grid.config.ConfigValue;

public class LoadProperties{
	
	File f;
	FileInputStream fin;
	Properties p;
	
	public LoadProperties(String filepath)
	{
		
		try {
			f=new File(filepath);
			fin=new FileInputStream(f);
			p=new Properties();
			p.load(fin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getData(String element)
	{
		String data = p.getProperty(element);
		return data;
	}
}

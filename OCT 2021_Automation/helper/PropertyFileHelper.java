package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHelper {
	
	Properties pr=null;
	
	public PropertyFileHelper(String propName) throws IOException
	{
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Resource\\"+propName;
		
		File f=new File(actual_path);
		
		FileInputStream fis=new FileInputStream(f);
		
		pr=new Properties();
		pr.load(fis);
	}
	
	public String getPropertyValue(String key)
	{
		return pr.getProperty(key);
	}
}

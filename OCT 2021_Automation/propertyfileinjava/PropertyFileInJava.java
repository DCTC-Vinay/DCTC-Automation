package propertyfileinjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileInJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		String actual_path = path + "\\Resource\\test.properties";

		File f = new File(actual_path);

		FileInputStream fin = new FileInputStream(f);

		Properties pr = new Properties();
		pr.load(fin);

		String user_id = pr.getProperty("uid");
		System.out.println(user_id);
		
		String pass = pr.getProperty("pass");
		System.out.println(pass);
		
		
		FileOutputStream fos=new FileOutputStream(f);
		pr.setProperty("pass", "test@5555");
		pr.store(fos, "updated on 18.01");
		
	}

}

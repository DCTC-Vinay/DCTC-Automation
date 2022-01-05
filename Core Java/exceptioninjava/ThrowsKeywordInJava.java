package exceptioninjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsKeywordInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			input();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void input() throws Exception
	{
		File f=new File("C://input.txt");
		FileInputStream fin=new FileInputStream(f);
		fin.close();
	}
}

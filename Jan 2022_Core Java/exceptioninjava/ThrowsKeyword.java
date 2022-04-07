package exceptioninjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ThrowsKeyword tk=new ThrowsKeyword();
		tk.getData();
	}
	
	public void getData() throws FileNotFoundException
	{
		File f=new File("");
		FileInputStream fin=new FileInputStream(f);
		System.out.println("After Catch Block");
	}

}

package exceptionInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

	public static void main(String[] args) throws FileNotFoundException,NumberFormatException {
		// TODO Auto-generated method stub
		ThrowsKeyword tk = new ThrowsKeyword();
		tk.fileCall();
		tk.numberFormat();
		System.out.println("Test in Main");
	}

	public void fileCall() {
		File f = new File("a.xlsx");

		try {
			FileInputStream ff = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Test in File Call");
	}
	
	public void numberFormat()
	{
		try
		{
			Class.forName("Java");
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

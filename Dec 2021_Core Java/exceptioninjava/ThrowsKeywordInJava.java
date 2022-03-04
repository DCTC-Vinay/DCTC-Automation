package exceptioninjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThrowsKeywordInJava {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String :");
		String str=	br.readLine();			//checked exception
		
		int a=Integer.parseInt(str);
		
		System.out.println("Entered String is:"+str);
		
		System.out.println("Test");
		
		
	}

}

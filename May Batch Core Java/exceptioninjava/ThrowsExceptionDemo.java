package exceptioninjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ThrowsExceptionDemo t=new ThrowsExceptionDemo();
		t.test();
		t.test();
		t.test();
		t.file_read();
	}
	public void test() throws Exception
	{
		int x=0;
		int no[]= {56,0,25};
		
		x=no[1]*no[0];
		System.out.println("Multiplication :"+x);
		x=no[3]/no[1];
		
		System.out.println("Division :"+x);
		
		x=no[1]+no[0];
		System.out.println("Addition :"+x);
		
		x=no[1]-no[0];
		System.out.println("Substraction :"+x);
	}
	
	public void file_read() throws FileNotFoundException
	{
		FileInputStream fin=new FileInputStream("a.txt");
	}
}

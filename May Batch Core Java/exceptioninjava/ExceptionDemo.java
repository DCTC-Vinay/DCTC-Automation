package exceptioninjava;

import java.io.FileInputStream;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//checked exception -- we are aware at compile time
		
		//FileInputStream fin=new FileInputStream("a.txt");
		
		//unchecked exception -- we are not aware
		
		
		int no=56, n=0, x=0;
		
		x=no*n;
		System.out.println("Multiplication :"+x);
		
		x=no/n;
		System.out.println("Division :"+x);
		
		x=no+n;
		System.out.println("Addition :"+x);
		
		x=no-n;
		System.out.println("Substraction :"+x);
	}

}

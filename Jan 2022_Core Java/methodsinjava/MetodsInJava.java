package methodsinjava;

import java.util.Scanner;

public class MetodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		arithmetic();		//without parameter
		bitwise(2,3);		//with parameter
	}
	public static void bitwise(int a,int b)
	{
		int c= a & b;
		System.out.println("a & b : "+c);
		
		c= a | b;
		System.out.println("a | b : "+c);
		
		c= a ^ b;
		System.out.println("a ^ b : "+c);
	}
	public static void arithmetic()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of w: ");
		int w=sc.nextInt();
		System.out.println("Enter value of x: ");
		int x=sc.nextInt();
		
		int c= w + x;
		System.out.println("Addition : "+c);
		
		c=w - x;
		System.out.println("Substraction : "+c);
		
		c=w * x;
		System.out.println("Multiplication : "+c);
		
		float q=(float)x / w;
		System.out.println("Division : "+q);
		
		float g=34;
		float h=12;
		
		float n=g % h;
		System.out.println("Modulus : "+n);
		
	}

}

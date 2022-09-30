package loopsinjava;
import java.util.Scanner;

public class TakingInputInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
		
		System.out.print("Enter String : ");
		String str=s.next();
		
		System.out.println(str);
		
		System.out.print("Enter Float : ");
		float f=s.nextFloat();
		
		System.out.println(f);
		
		System.out.println("Enetr 5 Values into Array");
		int x[]=new int[5];
		for(int i=0;i<x.length;i++)
		{
			x[i]=s.nextInt();
		}
		
		//For Displaying Values inside Array
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
	}

}




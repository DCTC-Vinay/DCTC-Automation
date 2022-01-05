package arraysinjava;

import accessmodifierinjava.A;

public class ArraysInJava extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
out:	for(int i=0;i<5;i++)		// outer for loop
		{
			System.out.println("i: "+i);
			
			for(int j=0;j<3;j++)	//inner for loop
			{
				if(i==1)
				{
					continue out;
				}
				System.out.println("j:"+j);
			}
		}
		System.out.println("Out of For Loop");
		
	
		
		//nested for
		
out:	for(int i=0;i<5;i++)		// outer for loop
		{
			System.out.println("Outer For Loop i: "+i);
			
			for(int j=0;j<3;j++)	//inner for loop
			{
				System.out.println("Inner For Loop J: "+j);
				for(int k=0;k<3;k++)
				{
					System.out.println("Inner For Loop K: "+k);
					if(i==1)
					{
						System.out.println("Value of i : "+i);
						continue out;		//simple continue
					}
					System.out.println("after continue");
				}
				System.out.println("Inner For Loop : "+j);
			}
		}
		System.out.println("Out of For Loop");
		
		
		
		char we[]= {'h','e','l','l','o'};
		System.out.println(we);
		
		for(int i=2;i<3;i++)
		{
			System.out.println("Hello");
		}
	
		
		
		int n[]=new int[5];	// One dimensional Array Declaration in Java
		
		//Array Initialization
		
		n[0]=12;
		n[1]=13;
		n[2]=14;
		n[3]=17;
		n[4]=67;
		
		for(int i=0;i<5;i++)
		{
		
			System.out.println(n[i]);
		}
		
		
		
		
		int m[]= {12,34,56,67,98}; //array declaration and initialize
		
		System.out.println(m[1]);
		
		
		
	}

}

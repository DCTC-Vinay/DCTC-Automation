package operatorsinjava;

public class UnaryOperator {
	
	public static void main(String[] args) {
		
		//increment operator
		int a=10;
		
		a++;
		System.out.println("value of a :"+a);
		
		//Decrement
		int b=9;
			
		b--;
		System.out.println("value of a:"+b);
		
		//compliment
		int x=~a;
		System.out.println("value of x:"+x);
		
		
		//not operator
		boolean y=false;
		boolean z=!y;
		
		System.out.println("value of z :"+z);
		
		
		//increment and decrement in other way
		int m=5,n;
		n=m++;		//postfix
		
		System.out.println("****POSTFIX ADDITION*****");
		System.out.println("value of n :"+n);
		System.out.println("value of m :"+m);
		
		System.out.println("****PREFIX ADDITION****");		
		n=++m;		//prefix
		
		System.out.println("value of n :"+n);
		System.out.println("value of m :"+m);
		
		System.out.println("****POSTFIX SUB*****");
		n=m--;
		System.out.println("value of n :"+n);
		System.out.println("value of m :"+m);
	
		System.out.println("****PREFIX SUB*****");
		n=--m;
		System.out.println("value of n :"+n);
		System.out.println("value of m :"+m);
	}

}
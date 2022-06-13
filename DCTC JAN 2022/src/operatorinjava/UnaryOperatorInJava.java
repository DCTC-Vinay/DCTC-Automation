package operatorinjava;

public class UnaryOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=4;
		
		int c=a++;
		
		System.out.println("value of a : "+a);
		System.out.println("value of c : "+c);
		
		int b=7;
		int d=b--;
		
		System.out.println("value of b : "+b);
		System.out.println("value of d : "+d);
		
		int e= 32;
		
		int f= ~e;
		System.out.println("value of f : "+f);
	}

}

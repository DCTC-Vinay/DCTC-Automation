package operator;
public class AssignmentOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45;			//assignment operator
		int b=3;
	
		a=a+23;				//a=a+23
		System.out.println("value of a :"+a);
		
		a+=b;			//a=a+b;
		System.out.println("value of a :"+a);
		
		b*=a;			//b=b*a;
		System.out.println("value of b :"+b);
		
		int c=30, d=32;
		
		c>>=2;			//c=c>>2;
		System.out.println("Value of c:"+c);
		
		d<<=3;			//d=d<<3;
		System.out.println("Value of d:"+d);
	}
}

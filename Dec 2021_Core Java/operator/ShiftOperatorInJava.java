package operator;

public class ShiftOperatorInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=10;
		int x= num << 2;
		
		System.out.println("Left Shift : "+x);
		
		int y=num >> 2;
		
		System.out.println("Right Shift : "+y);
		
		
		int a=12, b= 34;
		
		a+=b;		//a=a+b;
		
		a+=25;		//a=a+25;
		
		b-=25;		//a=a-25;
		
		b*=25;		//a=a*25;
		
		a/=25;		//a=a/25;
		
		a%=25;		//a=a%25;
		
		a<<=2;		//a=a<<2;
		
		a>>=2;		//a=a>>2;
		
	}

}

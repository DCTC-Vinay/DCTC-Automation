package methodOverloadingInJava;

public class MethodOverloadingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingInJava m=new MethodOverloadingInJava();
		m.add(12, 30);
		m.add(1,2,3);
		m.add(10,12);
	
	}

	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is: "+c);
		return c;
	}
	public void add(float a, float b)
	{
		
	}
	public int add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println("Addition is: "+d);
		return d;
	}
}

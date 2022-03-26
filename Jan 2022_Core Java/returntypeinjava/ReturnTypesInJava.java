package returntypeinjava;

public class ReturnTypesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnTypesInJava r=new ReturnTypesInJava();
		int n=r.returnInteger();
		
		System.out.println("Value of n: "+n);
		
		Float x=r.returnFloat();
		System.out.println("Value of x: "+x);
		
		boolean q=r.returnBoolean();
		System.out.println("Value of q: "+q);
		
		int c=r.sum(12, 13);
		System.out.println("Addition is: "+c);
		
		String str=r.returnString();
		System.out.println("Hello "+str);
	}
	public String returnString()
	{
		return "Ajay";
	}
	public int sum(int a, int b)
	{
		return (a+b);
	}
	
	public int returnInteger()
	{
		System.out.println("In Integer Method");
		return 10;
	}
	
	public float returnFloat()
	{
		System.out.println("In Float Method");
		return 23.45f;
	}
	
	public boolean returnBoolean()
	{
		System.out.println("In Boolean Method");
		return true;
	}

}

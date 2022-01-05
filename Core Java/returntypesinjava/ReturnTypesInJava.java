package returntypesinjava;

public class ReturnTypesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		returnNothing();
		int i = returnIntValue(12);
		System.out.println(i);
		double j = returnDoubleValue(12.45);
		System.out.println(j);
		boolean k = returnBooleanValue(false);
		System.out.println(k);
		char m = returnCharValue('d');
		System.out.println(m);
		
		int x[]= {12,13,54,45};
		int[] n = returnArray(x);
		for(int z:n)
		{
			System.out.println(z);
		}
	}

	
	public static int[] returnArray(int []n)
	{
		
		return n;
		
	}
	
	public static void returnNothing()
	{
		System.out.println("Do not return value");
	}
	
	public static int returnIntValue(int n)
	{
		System.out.println("return int value");
		return n;
	}
	
	public static double returnDoubleValue(double n)
	{
		System.out.println("return double value");
		return n;
	}
	
	public static boolean returnBooleanValue(boolean n)
	{
		System.out.println("return int value");
		return n;
	}
	
	public static char returnCharValue(char n)
	{
		System.out.println("return int value");
		return n;
	}
	
	
	
}

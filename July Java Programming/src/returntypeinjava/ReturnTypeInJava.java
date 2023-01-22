package returntypeinjava;

public class ReturnTypeInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object of class
		ReturnTypeInJava r=new ReturnTypeInJava();
		r.return_nothing();
		
		//call the metho0d
		int x=r.return_integer(45, 55);
		System.out.println("Result of integer method : "+x);
		
		boolean y=r.return_boolean();
		System.out.println("Result of Boolean method :"+y);
		
		System.out.println("Result of float : "+r.return_float());
		
		System.out.println("Result of String :"+r.return_string("Hello", "Java"));
		
		char w[]=r.return_array();
		
		//displaying values in array using simple for loop
		for(int i=0;i<w.length;i++)
		{
			System.out.println(w[i]);
		}
		
		//displaying values in array using for each version of for loop
		for(char p:w)
		{
			System.out.println(p);
		}
		System.out.println("Result of array :"+w.length);
	}
	
	public void return_nothing()
	{
		System.out.println("inside void return type");
	}
	
	public int return_integer(int a, int b)
	{
		return (a+b);
	}
	
	public float return_float()
	{
		return 76.89f*23.56f;
	}
	
	public boolean return_boolean()
	{
		int a=56, b=67;
		return (a<b);
	}
	
	public String return_string(String str, String str1)
	{
		return (str+str1);
	}
	
	public char[] return_array()
	{
		char x[]= {'w','e','l','c','o','m','e'};
		return x;
	}
	
}






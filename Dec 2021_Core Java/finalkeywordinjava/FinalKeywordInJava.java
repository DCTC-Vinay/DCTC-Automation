package finalkeywordinjava;

public class FinalKeywordInJava {

	//need to assign value to final variable
	//we cant change the value of final variable
	
	//final method will not be overridden
	//final class -- it will not be inherited
	
	final int a=12;		
	
	public FinalKeywordInJava()
	{
		
	}
	
	public final void test()		//method is final
	{
		
		//a++;
		System.out.println("Value of a :"+a);
	}
}

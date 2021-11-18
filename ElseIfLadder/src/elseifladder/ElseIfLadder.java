package elseifladder;

public class ElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			valueCheck(11.7);
			relationOperator(32,56);
			conditionCheck();
			
			System.out.println("2nd Time Call");
			valueCheck(13.87);
			relationOperator(92,45);
			conditionCheck();
			
		}
	
	static void conditionCheck() //without parameter method
	{
		int marks=62;
		if(marks>=75) //false
		{
			System.out.println("Distinction");
		}
		else if(marks>=60) //true
		{
			System.out.println("First Class");
		}
		else if(marks>=40)
		{
			System.out.println("Second Class");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	static void relationOperator(int a,int b) //with parameter
	{
		boolean result=a>b;
		
		System.out.println("THE RESULT IS A>B="+result);
		
		boolean res=a<b;
		System.out.println("a<b = "+res);
		
		int n=45, m=45;
		boolean rresult=n>=m;
		
		System.out.println("n>=m = "+rresult);
		
		boolean q=n<=m;
		System.out.println("n<=m ="+q);
	}
	
	static void valueCheck(double f) //with parameter method
	{
		System.out.println("The Value is : "+f);
	}
}

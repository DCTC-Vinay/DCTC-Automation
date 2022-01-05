package arraysinjava;

public class SearchNumberInArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SearchNumberInArray sn=new SearchNumberInArray();
		sn.input();
		
		
		double i = sn.searchNumber(95);	//method for searching number in array
		System.out.println("Return Value : "+i);
		
		
	}
	
	public static void input3()
	{
		input2();
	}
	
	public void input()
	{
		System.out.println("Test Method");
		searchNumber(34);
	}
	
	public static void input2()
	{
		System.out.println("Test Method2");
	}
	
	public double searchNumber(int m)
	{
		int n[]= {34,32,21,67,87,95,56};
		int x=n.length;		//property of Array. Finding the length of Array.
		int i;

		for(i=0;i<x;i++)
		{
			if(n[i]==m)
			{
				System.out.println("Number Found at "+i+" location");
				break;
			}
		}
		
		if(i==x)
		{
			System.out.println("Number Not Found");
		}
	
		return 12.2;
	}

}

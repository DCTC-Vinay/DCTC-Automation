package loopsinjava;

public class ForLoopForArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ForLoopForArray f=new ForLoopForArray();
		//f.one_dimensional_array();
		f.search_array(198);
	}
	
	public void search_array(int num)
	{
		int x[]= {78,54,68,98,122,477,226};
		boolean f=false;
		int i=0;
		for(i=0;i<x.length;i++)
		{
			if(x[i]==num)
			{
				f=true;
				break;
			}
		}
		
		if(f==true)
		{
			System.out.println("Number Found at Location "+i);
		}
		else
		{
			System.out.println("Number Not Found");
		}
	}
	
	public void one_dimensional_array()
	{
		
		//Normal For Loop
		int y[]=new int[5];		//declaration of array
		y[0]=78;
		y[1]=45;
		y[2]=89;
		y[3]=11;
		
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}
		
		//For Each Version of For Loop
		System.out.println("For Each Version of For Loop");
		for(int z:y)
		{
			System.out.println(z);
		}
		

		//Character Array Using normal For and for each version 
		char q[]= {'w','e','l','c','o','m','e'};
		
		for(int i=0;i<q.length;i++)
		{
			System.out.print(q[i]);	
		}
		System.out.println();
	
		
		//Character Array Using for each version
		for(char s:q)
		{
			System.out.print(s);
		}
		System.out.println();
	}
}
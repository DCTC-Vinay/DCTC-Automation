package foreachversion;

public class ForEachVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Printing 1 to 10 Table Using Nested For Loop 
		//int sum=0;
		for(int i=1;i<=10;i++)
		{
			// sum=sum+9;
			for(int j=1;j<=10;j++)
			{
			 System.out.print(j*i);
			 System.out.print("\t");
			}
			System.out.println();
		}
		
		
		
		
		
		int n[]= {34,32,21,67,87,95,56,76,30};
		int x=n.length;
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		
		System.out.println("For each");
		for(int i:n)
		{
			System.out.println(i);
		}
	}

}

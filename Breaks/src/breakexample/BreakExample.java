package breakexample;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
iloop:	for(int i=0;i<5;i++) //outer for loop
		{
	   
			System.out.println("Value of i:"+i);
			
jloop:		for(int j=0;j<5;j++) //inner for loop
			{
				System.out.println("Value of j: "+j);
				if(i==j)
				{
					continue iloop;
				}
				System.out.println("After Continue");
			}
			
			
		}
	}

}

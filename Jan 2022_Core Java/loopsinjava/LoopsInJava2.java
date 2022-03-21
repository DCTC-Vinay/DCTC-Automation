package loopsinjava;

public class LoopsInJava2 {

	public static void main(String[] args) {
		
		
outer:	for(int i=0;i<=5;i++)
		{
			System.out.println("Value of i :"+i);
			for(int j=0;j<2;j++)
			{
				System.out.println("Value of j :"+j);
				if(i==j)
				{
					break outer;
				}
				
			}
		}

A:		for (int x = 0; x <= 5; x++) {
			System.out.println("Value of x :" + x);
			for (int y = 0; y < 2; y++) {
				if (x == y) {
					continue;
				}
				System.out.println("Value of y :" + y);
				
				
			}
		}
	}
}

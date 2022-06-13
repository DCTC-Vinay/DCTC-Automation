package decisionmakingstatement;

public class PrimeNumberInJava {

	
		public static void main(String[] args) {
			
			int count=0;
			int i=2;
			int j=1;
			for(i=2;i<=10;i++)
			{
				count=0;
				for(j=1;j<=i;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				
				if(count==2)
				{
					System.out.println(i);
				}
			}
			
			
		}
}

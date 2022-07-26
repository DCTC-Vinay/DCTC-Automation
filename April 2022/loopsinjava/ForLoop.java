package loopsinjava;
public class ForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println("Hello");
		}
		
		int j;
		int n=30;
		
		for(j=10;j>=1;j--)
		{
			System.out.println(n*j);
		}
		for(i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+" is Even");
			}
			else
			{
				System.out.println(i+" is Odd");
			}
		}
		
		for(i=40;i<=50;i=i+2)
		{
			System.out.println(i+" is Even");
		}
	}
}

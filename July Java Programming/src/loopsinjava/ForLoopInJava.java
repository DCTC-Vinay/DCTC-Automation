package loopsinjava;

public class ForLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<10;i++)
		{
			System.out.println(i+" Hello");
		}
		
		for(int num=0;num<100;num++)
		{
			if(num%2==0)
			{
				System.out.println(num+" Number is Even");
			}
			else
			{
				System.out.println(num+" Number is Odd");
			}
		}
	}
}

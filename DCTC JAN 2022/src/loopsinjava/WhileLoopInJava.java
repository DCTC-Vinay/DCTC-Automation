package loopsinjava;

public class WhileLoopInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		while(i<5)
		{
			System.out.println("In while loop");
			System.out.println("hii");
			i++;
		}
		
		int j=-1;
		while(j>0)
		{
			System.out.println("Hello");
			j--;
		}
		
		j=-1;
		do
		{
			System.out.println("Bye");
			i--;
		}while(j>0);
		
		int n=0;
		do
		{
			System.out.println("Value of n:"+n);
			n++;
		}while(n<5);
		
	}

}

package loopsinjava;

public class LoopsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for, while and do-while
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("hi :"+i);
		}
		
		int a[]=new int[5];
		a[0]=34;
		a[1]=2;
		a[2]=45;
		a[3]=90;
		a[4]=23;
		
		for(int x=0;x<a.length;x++)
		{
			System.out.println(a[x]);
		}
		
		char x[]= {'q','r','s','t','u','q','e','z','o'};
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		for(char c:x)
		{
			System.out.println(c);
		}
		
		for(int q:a)
		{
			System.out.println(q);
		}
	}

}







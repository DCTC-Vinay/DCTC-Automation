package arrayinjava;

public class ArrayInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//One Dimensional Array
		int a[]=new int[10];
		a[0]=57;
		a[1]=68;
		a[2]=78;
		a[3]=123;
		a[4]=245;
		
		System.out.println(a[0]);
		
		double x[]= {56.78,90.23,123.43,67.90,56.41,25.85,458.36};
		
		System.out.println("Length of Array X="+x.length);
		System.out.println("Length of Array A="+a.length);
		
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		char w[]= {'H','e','l','l','o',' ','J','a','v','a'};
		
		for(int j=0;j<w.length;j++)
		{
			System.out.print(w[j]);
		}
		
		String str[]={"Hello","Java","Programming","Welcome","To","Automation"};
		System.out.println();
		
		for(int k=0;k<str.length;k++)
		{
			System.out.println(str[k]);
		}
		
		ArrayInJava a1=new ArrayInJava();
		a1.array_test(str);
		
		a1.array_test_for_int(a);
		
	}
	
	public void array_test(String[] n)
	{
		System.out.println("Inside Array Test Function");
		for(int k=0;k<n.length;k++)
		{
			System.out.println(n[k]);
		}
	}
	
	public void array_test_for_int(int[] m)
	{
		System.out.println("Inside Array Test Int Function");
		for(int k=0;k<m.length;k++)
		{
			System.out.println(m[k]);
		}
	}
}





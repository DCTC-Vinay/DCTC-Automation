package loopsinjava;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;

		while(i>0)
		{
			System.out.println("Hello");
			i--;
		}
		
		int a[]= {5,6,7,8,9,10,34,12,35,78,90};
		int n=a.length;
		
		int j=0;
		
		while(j<n)
		{
			System.out.println(a[j]);
			j++;
		}
	}

}

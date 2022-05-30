package loopsinjava;

public class ForLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {5,6,7,8,9,10,34,12,35,78,90};
		int n=a.length;
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Two Dimensional Array");
	
		
		int b[][]= { {12,34,45,67},{56,67,22,68},{78,89,12,69}};
		int m=b.length;
		System.out.println("Length of Array :"+m);
		
		for(int j=0;j<m;j++)		//outer loop
		{
			for(int k=0;k<4;k++)	//inner loop
			{
				System.out.print(b[j][k]+" ");
			}		
			System.out.println();
		}
	}
}

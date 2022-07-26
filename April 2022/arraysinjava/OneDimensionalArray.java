package arraysinjava;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x[]=new float[5];
		x[0]=11;
		x[1]=12;
		x[2]=13;
		x[3]=14;
		x[4]=15;
		
		
		System.out.println(x[3]);
		
		System.out.println(x[0]);
		
		int []d= {45,57,78,65,32,11,55,40,30,20};
		System.out.println(d[3]);
		
		int e=d.length;
		
		for(int i=0;i<e;i++)
		{
			System.out.println(d[i]);
		}
		
	}

}

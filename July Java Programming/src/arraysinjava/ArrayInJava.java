package arraysinjava;

public class ArrayInJava {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayInJava a=new ArrayInJava();
		a.one_dimensional_array();
		a.two_dimensional_array();
	}
	
	public void one_dimensional_array()
	{
		int y[]=new int[5];		//declaration of array
		y[0]=78;
		y[1]=45;
		y[2]=89;
		y[3]=11;
		
		System.out.println(y[4]);
		
		//System.out.println(y[5]);
		
		int x[]= {34,67,23,90,12};
		System.out.println(x[2]);
		
		System.out.println("Length of Array x: "+x.length);
		
	}

	public void two_dimensional_array()
	{
		int z[][]=new int[2][2];
		z[0][0]=78;
		z[0][1]=34;
		z[1][0]=24;
		z[1][1]=54;
		
		System.out.println(z[1][0]);
		
		int q[][]= {{23,43,73},{76,54,92}};
		
		System.out.println(q[1][1]);
		System.out.println(q.length);
	}
}








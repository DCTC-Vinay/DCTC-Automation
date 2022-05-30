package arraysinjava;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];		//declaration
		a[0]=12;						//initialization
		a[1]=13;
		a[2]=14;
		a[3]=15;
		a[4]=16;
		

		int b[][]=new int[2][2];

		b[0][0]=56;
		b[0][1]=78;

		b[1][0]=89;
		b[1][1]=12;
		
		
		System.out.println(b[1][0]+b[1][1]);
		
		
		int j[]= {67,34,100,102,110,115};
		System.out.println(j[3]);
		
		int k[][]= { {56,34,89},{12,52,112}};
		System.out.println(k[1][1]);
		
		int x[][]= { {56,34},{89,12},{52,112}};
		System.out.println(x[2][0]);
		
		String w[]=new String[5];
		w[0]="Hi";
		w[1]="Hello";
		w[2]="Java Programming";
		
		String z[]= {"Hi","Hello","Java Programming","Bye"};
		System.out.println(z[1]+z[2]+w[0]);
	}

}






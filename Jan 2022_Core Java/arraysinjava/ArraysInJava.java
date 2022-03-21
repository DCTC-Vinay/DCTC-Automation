package arraysinjava;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		a[0]=34;
		a[1]=2;
		a[2]=45;
		a[3]=90;
		a[4]=23;
		System.out.println(a[2]);
		
		
		String str[]=new String[3];
		str[0]="Hi";
		str[1]="Hello";
		str[2]="Bye";
		System.out.println(str[2]);
		
		char x[]= {'q','r','s','t','u'};
		System.out.println(x[2]);
		
		
		int n[][]=new int[2][3];
		n[0][0]=34;
		n[0][1]=12;
		n[0][2]=56;
		
		n[1][0]=78;
		n[1][1]=89;
		n[1][2]=77;
		
		System.out.println(n[0][2]);
		
		int w[][]= {{23,11},{22,33},{44,55}};
		
	}

}

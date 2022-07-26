package arraysinjava;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float x[][]=new float[2][3];
		
		x[0][0]=11;
		x[0][1]=12;
		x[0][2]=13;
		x[1][0]=14;
		x[1][1]=15;
		x[1][2]=16;
		
		System.out.println(x[0][2]);
		System.out.println(x[1][1]);
		
		
		int z[][]= { {12,15,17,18}, {19,20,25,22} };
		System.out.println(z[0][2]);
		
		
	}

}

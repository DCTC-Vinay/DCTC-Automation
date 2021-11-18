package shiftoperator;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int t=10;
		int n=t<<3;
		System.out.println("Left Shift by 3 : "+n);*/
		
		int z=10;
		
		System.out.println(Integer.toBinaryString(z));
		int m=z>>3;
		System.out.println(Integer.toBinaryString(m));
		System.out.println("Right Shift by 3 : "+m);
		
		System.out.println();
		
		z=10;
		System.out.println(Integer.toBinaryString(z));
		int n=z<<3;
		System.out.println(Integer.toBinaryString(n));
		System.out.println("Left Shift by 3 : "+n);

	}

}

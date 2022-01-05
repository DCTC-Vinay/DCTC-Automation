package operatorsinjava;

public class ShiftOperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Shift Operator works on bits
		
		// 4 --> 0100
		// 2---> 0010
		// 0 --->0000 
		
		int n=4;
		int result=n>>1;
		
		System.out.println(result);
		
		//3 ----> 0011
		//6 ----> 0110
		//12----> 1100
	
		int z=3;
		result=z<<2;
		System.out.println("Left Shift ="+result);
		
		
		
	}

}

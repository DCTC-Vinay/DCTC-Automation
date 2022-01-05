package variableInJava;

public class VariableInJava {

	int n=20;	//Class Variable or Instance Variable is related with Object
	
	static int z=55;	//static variable is related with Class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=200;			// Local Variable
		
		System.out.println(b);
		
		int c;	//variable declaration
		c=10;	//initializing variable
		
		
		//whole numbers
		byte z=123;		// 1 Byte
		int s=1342444;	// 4 Byte	
		short a=1355;	// 2 Byte
		long x=12344543;	// 8 Byte
		
		
		//fractional values
		double u=12.23;	// 8 byte
		//float c=1.25f;	// 4 byte
		
		
		//characters
		char f='q';	// 2 byte
		
		//boolean
		boolean o=true; //1 bit
	}
	
	public static void show()
	{
		int x=100;	//Local Variable
	}

}

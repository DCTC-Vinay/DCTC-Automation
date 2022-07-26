package wrapperclass;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//converting primitive data type to object using valueof() method
		//Autoboxing -- converting data type to object
		
		int n=76;
		Integer x=Integer.valueOf(n);
		System.out.println(x);
		
		//primitive data type to object
		
		char c='q';
		Character z=c;
		
		System.out.println(z);
		
		
		//object to primitive data type
		//Unboxing -- converting object to data type
		
		Character w='x';
		char a=w;
		
		System.out.println(a);
	}

}

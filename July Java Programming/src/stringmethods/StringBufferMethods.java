package stringmethods;

public class StringBufferMethods {
	
	public void stringbuffer_methods()
	{
		StringBuffer str=new StringBuffer("Java");
		System.out.println(str);
		System.out.println(str.length());
		
		str.append("Programming");
		
		System.out.println(str);
		System.out.println(str.length());
		
		str.delete(2, 5);
		
		System.out.println(str);
		System.out.println(str.length());
		
		System.out.println("Reverse : "+str.reverse());
	}
	
	
	public static void main(String[] args) {
	
		StringBufferMethods sf=new StringBufferMethods();
		sf.stringbuffer_methods();
		
	}

}

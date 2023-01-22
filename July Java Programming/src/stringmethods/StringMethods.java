package stringmethods;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringMethods s=new StringMethods();
		s.str_methods();
	}
	
	public void str_methods()
	{
		String str="Hello";
		
		System.out.println(str);
		System.out.println(str.toUpperCase());
		
		String str1=str.toLowerCase();
		System.out.println(str1);
	
		String original_str="Java";
		String compare_str="java";
		
		boolean q=original_str.equals(compare_str);
		System.out.println("equal result : "+q);
		
		boolean v=original_str.equalsIgnoreCase(compare_str);
		System.out.println("equal ignore result : "+v);
		
		int a=original_str.compareTo(compare_str);
		System.out.println("compare result : "+a);
		
		//ASCII Conversion
		char j='j';
		char J='J';
		System.out.println((int)j);
		System.out.println((int)J);
		
		
		Scanner s=new Scanner(System.in);
		String check="Hello Java Programming";
		
		System.out.println("Length of String : "+check.length());
		
		System.out.println("Enter String to Search");
		String n=s.next();
		System.out.println("Contains : "+check.contains(n));
		
		System.out.println("Enter String for Starts :");
		String m=s.next();
		System.out.println("Starts With : "+check.startsWith(m));
		
		System.out.println("Enter String Ends :");
		String o=s.next();
		System.out.println("Starts With : "+check.endsWith(o));
	}
}




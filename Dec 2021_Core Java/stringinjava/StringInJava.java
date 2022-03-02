package stringinjava;

public class StringInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=new String("HelloProgramming");
		String str1=new String("Java");
		
		String subString=str.substring(5,10);
		System.out.println(subString);
		
		boolean b=str1.equalsIgnoreCase("java");
		System.out.println("Equality of Strings Equals Ignore Case: "+b);
		
		boolean s=str1.equals("java");
		System.out.println("Equality of Strings : "+s);
		
		int q=str.compareTo("Java");
		System.out.println("Compare Strings:"+q);
		
		String str_lower=str.toLowerCase();
		System.out.println(str_lower);
		System.out.println(str);
		
		String str1_upper=str1.toUpperCase();
		System.out.println(str1_upper);
		
		char x=str.charAt(2);
		System.out.println("character at 2nd location: "+x);
		
		int n=str.length();
		System.out.println("Length of str = "+n);
		
		char str_array[]=str.toCharArray();
		for(int i=0;i<n;i++)
		{
			System.out.println(str_array[i]);
		}
		
		boolean z=str.startsWith("he");
		System.out.println("Result startsWith: "+z);
		
		boolean y=str.endsWith("ing");
		System.out.println("Result endsWith: "+y);
		
		String replace_string=str.replace('o', '-');
	
		String replace_complete=str.replace(str, str1);
		
		System.out.println("replace complete :"+replace_complete);
		
		System.out.println("replace o with - :"+replace_string);
	}

}

package stringandstringbuffer;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("java");
		String str1="Programming";
		String str4="java";
		
		//length method
		System.out.println("Length of str="+str.length());
		System.out.println("Length of str1="+str1.length());
		
		//toUpperCase and toLowerCase
		String str2=str.toUpperCase();
		System.out.println("Upper Case of str:"+str2);
		
		String str3=str.toLowerCase();
		System.out.println("Lower Case of str:"+str3);

		//char at - for getting character of given location
		System.out.println("Char At :"+str1.charAt(9));

		//replace --replaces all occurances of the given character
		System.out.println("replace :"+str1.replace('r', 'o'));
	
		//equals -- checking the equality of two strings
		System.out.println("Equality :"+str.equals(str4));
		
		//equalsIgnoreCase--checking the equality of two strings
		System.out.println("Equality ignore case:"+str.equalsIgnoreCase(str4));
		
		//comparing of Strings
		System.out.println("Compare To :"+str4.compareTo(str));
		
		//contains -- checking the string is available in given string
		System.out.println("Contains :"+str1.contains("gram"));
		
		//startwith -- whether the available string starts with given string
		System.out.println("starts with :"+str1.startsWith("Pra"));
		
		//endswith -- whether the available string ends with given string
		System.out.println("Ends with :"+str1.endsWith("in"));
		
		//concat -- used for joining of two strings
		System.out.println("joining of strings:"+str.concat(str1));
	}

}






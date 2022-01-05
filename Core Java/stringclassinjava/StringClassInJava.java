package stringclassinjava;

public class StringClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str=new String("Hello");
		String str1="Java";
		String str3="";
		String str4="Learning Automation Using Java";
		
		System.out.println(str4.endsWith("JaVa"));
		
		boolean x = str4.startsWith("Leaning");
		System.out.println(x);
		
		char[] ch = str.toCharArray();
		for(char ch1:ch)
		{
			System.out.println(ch1);
		}
		
		String str2 = str.concat(str1);
		
		System.out.println(str);
		
		System.out.println("Concat string: "+str.concat(str1));
		
		System.out.println("length of string : "+str.length());
		
		System.out.println("Character at 0th location : "+str.charAt(0));
		
		System.out.println("index of character : "+str.indexOf('l'));
		
		System.out.println("index of character : "+str.lastIndexOf('l'));
		
		System.out.println("Empty or not : "+str3.isEmpty());
		
		System.out.println("Replace:"+str.replace('e', 'w'));
	
		String[] str5 = str4.split(" ");
		
		for(String e:str5)
		{
			System.out.println(e);
		}
		
		System.out.println("Capital : "+str4.toUpperCase());
		System.out.println("Small : "+str.toLowerCase());
		
		
		System.out.println("Comparing : "+str.compareTo("Hi"));
		
		System.out.println("Equal :"+str.equalsIgnoreCase("hello"));

		
	}

}

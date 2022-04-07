package stringsinjava;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=new String("Java Programming ");
		String str1="Language";
		String str4="language";
		
		String str2=str.toUpperCase();
		System.out.println(str2);
		
		String str3=str1.toLowerCase();
		System.out.println(str3);
		
		System.out.println("Character at location : "+str.charAt(2));
		
		System.out.println(str1.charAt(0));
		
		System.out.println("Length of String :"+str.length());
		
		String concat=str+str1;
		System.out.println(concat);
		
		concat=str.concat(str1);
		System.out.println(concat);
		
		char e[]=str.toCharArray();
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Charater Location: "+i+" :"+e[i]);
		}
		
		//for each version of for Loop
		for(char a:e)
		{
			System.out.print(a);
		}
		
		System.out.println();
		//equals
		System.out.println("Equality of String : "+str1.equals(str4));
		
		//equalsIgnoreCase
		System.out.println("Equality of String Ignore Case: "+str1.equalsIgnoreCase(str4));
		
		//CompareTo
		System.out.println("Equality of String Compare To: "+str1.compareTo(str4));
		
		char s='l';
		System.out.println("ASCII of l :"+(int)s);

		char t='L';
		System.out.println("ASCII of L :"+(int)t);
		
		
		//displaying part of string
		System.out.println("Substring : "+str1.substring(4));
		
		System.out.println("Substring : "+str1.substring(4,5));
		
		//checking for whether the string contains given string
		System.out.println("Contains :"+str1.contains("l"));
	}

}









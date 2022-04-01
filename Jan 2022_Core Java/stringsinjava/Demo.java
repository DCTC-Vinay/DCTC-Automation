package stringsinjava;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=new String("Java Programming ");
		String str1="Language";
		
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
		for(char a:e)
		{
			System.out.print(a);
		}
	}

}









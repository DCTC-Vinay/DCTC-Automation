package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str=new String("Hello");
		
		String str1=str.toUpperCase();
		System.out.println("In Upper Case :"+str1);
		
		String str2=str1.toLowerCase();
		System.out.println("Lower Case :"+str2);
		
		str2=str1.concat(str2);
		System.out.println("Concat :"+str2);
		
		str2=str+str1;
		System.out.println("Concat :"+str2);
		
		System.out.println("Length of Str2:"+str2.length());
		
		//char z = str.charAt(0);
		System.out.println("Character at 2nd Location :"+str.charAt(2));
		
		char s[]=str.toCharArray();
		for(char c:s)
		{
			System.out.println(c);
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("index of :"+str2.indexOf('x'));
		System.out.println("index of :"+str2.indexOf('H'));
		System.out.println("index of :"+str2.indexOf('H',1));
		
		System.out.println("Contains :"+str2.contains("llo"));
		
		System.out.println("Start-with :"+str2.startsWith("He"));
		
		System.out.println("Ends-with :"+str2.endsWith("eLLO"));

		String str7="    Hello World       ";
		System.out.println("Without Removing Space: "+str7);
		System.out.println("Removing Space: "+str7.trim());
		
	}
}






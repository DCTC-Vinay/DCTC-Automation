package stringandstringbuffer;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Hello ";
		
		String str3="Programming";
		
		String str1=str.toLowerCase();
		System.out.println(str1);
		
		String str2=str.toUpperCase();
		System.out.println(str2);
		
		int n=str.length();
		
		System.out.println(n);
		
		String str4=str.concat(str3);
		System.out.println(str4);
		
		int m=str3.indexOf('r');
		System.out.println(m);
		
		
		int x=str3.indexOf('r',m+1);
		System.out.println(x);
		
		char j=str.charAt(0);
		System.out.println(j);
		
		boolean z=str3.startsWith("P");
		System.out.println(z);
		
		boolean w=str3.endsWith("in");
		System.out.println(w);
		
		boolean i=str3.contains("m");
		System.out.println(i);
		
		String str5[]=str4.split(" ");
		
		str5=str4.split("Pr");
		
		String str6="      ABCD          ";
		
		System.out.println(str6);
		
		String str7=str6.trim();
		System.out.println(str7);
		
		String str8="Hello";
		String str9="hello";
		
		int u=str8.compareTo(str9);
		System.out.println(u);
		
		//ASCII Value of Character
		
		char h='H';
		int v=h;
		System.out.println(v);
		
		
		boolean p=str8.equals(str9);
		System.out.println(p);
		
		p=str8.equalsIgnoreCase(str9);
		System.out.println(p);
		
		
	}
}



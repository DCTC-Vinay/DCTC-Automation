package stringsinjava;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str=new StringBuffer("Java Programming ");
		StringBuffer str1=new StringBuffer("Language");
		StringBuffer str4=new StringBuffer("language");
		
		System.out.println("Character at location : "+str.charAt(2));
		
		System.out.println(str1.charAt(0));
		
		System.out.println("Length of String :"+str.length());
		
		//equals
		System.out.println("Equality of String : "+str1.equals(str4));
		
		//displaying part of string
		System.out.println("Substring : "+str1.substring(4));
		
		System.out.println("Substring : "+str1.substring(4,5));
		
		//append
		System.out.println("Append :"+str.append(str1));
		
		
		
		System.out.println("Replace : "+str.replace(4, 5, "-"));
		
		System.out.println("Before Length of String :"+str.length());
		//insert
		System.out.println("Insert: "+str.insert(2, "-"));
		
		System.out.println("After Length of String :"+str.length());
		//reverse
		System.out.println("Reverse :"+str.reverse());
		
		System.out.println("Reverse of reverse:"+str.reverse());
	}

}









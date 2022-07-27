package stringandstringbuffer;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Ajay");
		//length
		System.out.println("Length :"+str.length());
		
		//append -- joining of strings
		System.out.println("Append :"+str.append("Shinde"));
		System.out.println("Length after join:"+str.length());
		
		//insert new string
		System.out.println("insert :"+str.insert(4, "Laxman"));
		System.out.println("insert :"+str.insert(4, " "));
		System.out.println("insert :"+str.insert(11, " "));
		
		//reverse of string
		System.out.println("Reverse :"+str.reverse());
			
		//program for palindrome
		String str1="programming";
		StringBuffer str2=new StringBuffer(str1);
		str2.reverse();
		String str3=str2.toString();
		System.out.println(str3);
		if(str1.equals(str3))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}






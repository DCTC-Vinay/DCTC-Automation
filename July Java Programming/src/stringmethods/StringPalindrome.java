package stringmethods;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="anna";
		
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		
		String d=str1.toString();
		
		if(str.equals(d))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	}
}

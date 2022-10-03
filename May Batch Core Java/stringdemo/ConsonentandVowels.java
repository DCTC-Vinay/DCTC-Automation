package stringdemo;

public class ConsonentandVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="@Aba0 $fv%h4 7^hEi o*2h h%8j u#9a~f -7";
		
		String str1=str.toLowerCase();
		
		int v=0, c=0, s=0, d=0, sp=0;
		
		for(int i=0;i<str1.length();i++)
		{
			char ch=str1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u')
			{
				v++;
			}
			else if(ch==' ')
			{
				s++;
			}
			else if(ch>='0' && ch<='9')
			{
				d++;
			}
			else if(ch>='a' && ch<='z')
			{
				c++;
			}
			else
			{
				sp++;
			}
		}
		
		System.out.println("Vowels :"+v);
		System.out.println("Consonents :"+c);
		System.out.println("Space Count :"+s);
		System.out.println("Digit :"+d);
		System.out.println("Special Symbol :"+sp);
	}

}

package stringmethods;

import java.util.Scanner;

public class StringMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringMethods2 s=new StringMethods2();
		s.str_methods();
	}
	
	public void str_methods()
	{
		Scanner s=new Scanner(System.in);
		String str="Hello Java Programming Object Oriented";
		
		System.out.println("Replace : "+str.replace('a', 'e'));
		
		String str_split[]=str.split(" ");
		for(String s1:str_split)
		{
			System.out.println(s1);
		}
		
		String str2="   Java Program      ";
		System.out.println(str2.trim());
	
		String str3="Object Oriented Proramming Language";
		char[] w = str3.toCharArray();
		
		for(char x:w)
		{
			System.out.println(x);
		}
		
		
		//counting a character in given String
		int count=0;
		
		for(int i=0;i<w.length;i++)
		{
			if(w[i]=='O')
			{
				count++;
			}
		}
		
		System.out.println("character a in given string : "+count);
		
		
	}
}




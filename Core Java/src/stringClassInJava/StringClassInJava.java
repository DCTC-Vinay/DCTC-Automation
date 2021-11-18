package stringClassInJava;

import java.util.Scanner;

public class StringClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//charAt(),length(),startsWith(),endsWith(),replace
		
		boolean flag=false;
		int count =1;
		String str="Hello Java. Hi Java";
		String str1="   I am Vinay   of DCTC";
		String password="Hello";
		String user="";
		
		StringBuilder sd=new StringBuilder("Automation");
		sd.append("In Java");
		System.out.println(sd);
		
		
		StringBuffer sb=new StringBuffer("Hello");
		sb.append("hi");
		sb.append("java");
		
		System.out.println(sb.reverse());
		
		String str7="Hello";
		str7.concat("Hi");
		str7.concat("Java");
		System.out.println(str7);
		
		String strchange=str.replace('a','r');
		System.out.println(strchange);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password");
		user=sc.next();
		while(!flag)
		{
			if(user.equals(password))
			{
				System.out.println("You are logged in");
				break;
			}
			else
			{
				count++;
				System.out.println("Enter valid credentials");
				System.out.println("Enter Password");
				user=sc.next();
				if(count>=3)
				{
					System.out.println("You reached Maximum Limit");
					break;
				}
				
			}
			
		}
		
		
		
		System.out.println(str1.contains("Vinay"));
		System.out.println("******************");
		System.out.println(str.substring(6,8));
		System.out.println(str.substring(6,11));
		System.out.println("******************");
		
		System.out.println(str.charAt(0));
		System.out.println(str.length());
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("o"));
		System.out.println(str.replace('a','r'));
		System.out.println(str1);
		
		System.out.println(str1.trim());
		String str2[]=str.split(" ");
		for(String str3:str2)
		{
			System.out.println(str3);
		}
	}

}

package wrapperclass;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="abcde78fghi92j";
		
		char e[]=str1.toCharArray();
		
		int m=e.length;
		
		int sum=0;
		
		for(int i=0;i<m;i++)
		{
			if(Character.isDigit(e[i]))
			{
				System.out.println("Digits :"+e[i]);
		
				int n=Integer.parseInt(String.valueOf(e[i]));
				
				sum=sum+n;
			}
		}
		
		System.out.println("Sum ="+sum);
		
	}

}

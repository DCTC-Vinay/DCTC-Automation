package decisionmakinginjava;

public class SwitchStatementInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int per=75;
		
		int ch=per/10;
		
	//	char n='a';
		
		
	/*
	 * switch (n) { case 'a': case 'A': System.out.println("Vowels"); break; case
	 * 'e': case 'E': System.out.println("Vowels"); break; case 'i': case 'I':
	 * System.out.println("Vowels"); break; case 'o': case 'O':
	 * System.out.println("Vowels"); break; case 'u': case 'U':
	 * System.out.println("Vowels"); break; default:
	 * System.out.println("Consonant"); }
	 */
		 
		
		switch(ch)
		{
			case 1:
			case 2:
			case 3:
				System.out.println("Fail");
				break;
			case 4:
			case 5:
				System.out.println("Second Class");
				break;
			case 6:
			case 7:
				System.out.println("First Class");
				break;
			default:
				System.out.println("Distinction");
		}
		
		System.out.println("Outside of Switch Block");
	}

}

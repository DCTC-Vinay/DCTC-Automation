package prefixnpostfix;

public class PrefixnPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Local Variables
		int i=7;
		int j=10;
		
		int k;
		
		
		k=i++;
		
		k=i;
		i=i+1;
		
		System.out.println("Postfix :"+i);
		System.out.println("Postfix Value of k:"+k);
		
		k=++j;
		j=j+1;
		k=j;
		
		System.out.println("Prefix :"+j);
		System.out.println("Prefix Value of k:"+k);
		
	}

}

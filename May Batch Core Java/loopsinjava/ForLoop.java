package loopsinjava;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer:	for(int i=0;i<5;i++)
		{
		inner:	for(int j=0;j<5;j++)
			{
				System.out.println("Hello Java : i="+i+" j="+j);
				if(i==j)
				{
					break outer;
				}
			}
		}
	}

}

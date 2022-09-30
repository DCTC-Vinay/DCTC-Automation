package arrayinjava;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int q[][]=new int[3][3];
		q[0][0]=78;
		q[0][1]=85;
		q[0][2]=25;
		
		q[1][0]=88;
		q[1][1]=95;
		q[1][2]=35;
		
		q[2][0]=178;
		q[2][1]=185;
		q[2][2]=125;
		
		for(int i=0;i<q.length;i++)		//Row
		{
			for(int j=0;j<q.length;j++)	//Column
			{
				System.out.println(q[i][j]);
			}
		}
		
		
		int s[][]= { {2,3,4},{4,5,6},{7,8,9} };
		for(int i=0;i<s.length;i++)		//Row
		{
			for(int j=0;j<s.length;j++)	//Column
			{
				System.out.println(s[i][j]);
			}
		}
		
		int c[][]= {{5,8}, {7,9}};
		
	}
}





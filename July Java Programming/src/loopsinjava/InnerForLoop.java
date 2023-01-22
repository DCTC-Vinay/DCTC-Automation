package loopsinjava;

public class InnerForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InnerForLoop in=new InnerForLoop();
		in.two_dimensional_array();
	}
	
	public void inner_for_loop()
	{
		for(int i=0;i<5;i++)		//outer for Loop
		{
			for(int j=0;j<2;j++)	//inner for Loop
			{
				System.out.println("Value of i= "+i+"and j= "+j);
			}
		}
	}
	
	public void two_dimensional_array()
	{
		int q[][]= {{23,43,73},{76,54,92}};
		for(int i=0;i<q.length;i++)		//For Row
		{
			for(int j=0;j<3;j++)		//For Column
			{
				System.out.println(q[i][j]);
			}
		}
		
		String data[][]= {{"1","15478","Vinay","Pune"},{"2","78145","Ajay","Mumbai"}};
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(data[i][j]+" ");
			}
			System.out.println();
		}
	}

}





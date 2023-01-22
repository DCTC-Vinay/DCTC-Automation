package superkeyword;

public class JobOpportunity extends Account{
	
	String jd;
	public JobOpportunity() {
		// TODO Auto-generated constructor stub
		jd="Needed a passinate Test Engineer";
	}
	
	public void show_info()
	{
		System.out.println(jd);
	}
	
	public void show_info(String e)
	{
		
	}
	public static void main(String[] args) {
		
		JobOpportunity j=new JobOpportunity();
		j.emp_info();
		j.emp_designation();
		j.show_info();
	}
	
}

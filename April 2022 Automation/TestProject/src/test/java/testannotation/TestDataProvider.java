package testannotation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

	@DataProvider (name = "testdata")
    public Object[][] dpMethod(){
	 //return new Object[][] {{1,2,3}, {3,5,7},{5,7,8}};
		
		return new Object[][] {{"Java","Automation"},{"Selenium","Framework"}};
    }
	
	/*
	 * @Test (dataProvider = "testdata") public void myTest (int a, int b, int c) {
	 * System.out.println("Passed Parameter Is : " + a+" "+b+" "+c);
	 * 
	 * // int x=a+b; // Assert.assertEquals(x,c); }
	 */
	
   @Test (dataProvider = "testdata")
   public void myTest (String a,String b) {
       System.out.println("Passed Parameter Is : " + a+" "+b);
       
       Assert.assertEquals(a,b);
   }
}





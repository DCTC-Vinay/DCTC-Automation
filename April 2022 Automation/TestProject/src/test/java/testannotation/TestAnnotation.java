package testannotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAnnotation {
  @Test(invocationCount = 5)
  public void test_a() {
	  System.out.println("In a method");
  }
  
  @Test(enabled=false)
  public void test_e()
  {
	  System.out.println("In e method");
	  Assert.assertTrue(false);
  }
  
  @Test(dependsOnMethods = "test_e")
  public void test_g()
  {
	System.out.println("In g method");  
  }
  
}

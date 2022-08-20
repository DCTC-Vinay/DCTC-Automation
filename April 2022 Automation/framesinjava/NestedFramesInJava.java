package framesinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesInJava {

	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NestedFramesInJava f=new NestedFramesInJava();
		f.setup_browser();
		f.test_nestedframe();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
	}
	public void test_nestedframe()
	{
		  driver.switchTo().frame("frame1");	
		  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		  WebElement c=driver.findElement(By.xpath("//p[contains(text(),'Child')]"));
		  System.out.println(c.getText());
	}
}







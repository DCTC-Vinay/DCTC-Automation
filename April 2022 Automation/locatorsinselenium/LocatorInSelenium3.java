package locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium3 {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorInSelenium3 s=new LocatorInSelenium3();
		s.test_login();
	}	
	public void test_login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Actual Xpath
		WebElement user_email = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		user_email.sendKeys("vinay.salunke@gmail.com");
		
		//Actual Xpath
		WebElement user_pwd=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input"));
		user_pwd.sendKeys("Abc@123");
		
		//relative Xpath
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}
}




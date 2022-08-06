package locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium2 {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorInSelenium2 s=new LocatorInSelenium2();
		s.test_login();
		//s.test_msbte();
	}	
	public void test_login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement user_email = driver.findElement(By.id("email"));
		user_email.sendKeys("vinay.salunke@gmail.com");
		
		WebElement user_pass=driver.findElement(By.id("pass"));
		user_pass.sendKeys("123456");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		//driver.findElement(By.id("identify_email")).sendKeys("test@test.com");
		
		driver.findElement(By.className("inputtext _9o1w")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.tagName("button")).click();
		
		//driver.close();
		
	}
	
	public void test_msbte()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.msbte.org.in/");
		
		driver.findElement(By.partialLinkText("Summer 2022 Exam result")).click();
	}
}







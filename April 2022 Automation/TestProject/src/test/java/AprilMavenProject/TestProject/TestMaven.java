package AprilMavenProject.TestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMaven {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMaven t=new TestMaven();
		t.chrome_browser();
	}	
	public void chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement user_email = driver.findElement(By.id("email"));
		user_email.sendKeys("vinay.salunke@gmail.com");
		
		WebElement user_pass=driver.findElement(By.id("pass"));
		user_pass.sendKeys("123456");
		
		
		WebElement btn_login=driver.findElement(By.name("login"));
		//btn_login.click();
		btn_login.submit();
	}
}

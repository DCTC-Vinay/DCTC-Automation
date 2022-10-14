package testautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomationXpath {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		//Relative Xpath
		driver.findElement(By.xpath("//input[@type='password' or @name='email']")).sendKeys("test@test123.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd@abcd.com");
		
		//Actual Xath
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input")).sendKeys("test@domain.com");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div/input")).sendKeys("12345",Keys.ENTER);
		
		
	}

}

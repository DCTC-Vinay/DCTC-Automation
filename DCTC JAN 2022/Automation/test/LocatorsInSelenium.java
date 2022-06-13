package test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader=new FileReader("C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC JAN 2022\\resource\\test.properties");
		
		Properties p=new Properties();
		p.load(reader);
		
		String baseUrl=p.getProperty("baseUrl");
		String uid=p.getProperty("username");
		String pwd=p.getProperty("password");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
	
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys(uid);
		
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys(pwd);
		
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		//driver.close();
	}

}

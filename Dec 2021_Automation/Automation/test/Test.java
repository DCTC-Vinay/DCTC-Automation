package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links: "+tag.size());
		
		for(WebElement x:tag)
		{
			System.out.println(x.getText()+":"+x.getAttribute("href"));
		}
	}

}

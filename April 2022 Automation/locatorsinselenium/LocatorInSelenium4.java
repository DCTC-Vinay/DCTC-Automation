package locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium4 {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorInSelenium4 s=new LocatorInSelenium4();
		s.test_search();
	}	
	public void test_search()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
				
		
		//relative Xpath with *
		
		//for this to work use www.google.com
		//driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium Automation Tutorial");
		//driver.findElement(By.xpath("//*[@name='btnK']")).submit();
		
		
		//xpath using contains
		
		WebElement vote=driver.findElement(By.xpath("//a[contains(text(),'Voting')]"));
		
		//getText(), getAttribute() applicable to all web elements
		System.out.println(vote.getText());
		System.out.println(vote.getAttribute("href"));
		
		vote.click();
		
		WebElement span_tag = driver.findElement(By.xpath("//span[starts-with(text(),'Each state')]"));
		System.out.println(span_tag.getText());
	}
}



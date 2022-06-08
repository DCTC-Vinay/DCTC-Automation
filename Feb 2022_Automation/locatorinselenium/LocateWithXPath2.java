package locatorinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWithXPath2 {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocateWithXPath2 lw=new LocateWithXPath2();
		lw.setup_browser();
		lw.login();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	
	public void login()
	{
		WebElement tag = driver.findElement(By.tagName("a"));
		System.out.println(tag.getAttribute("href"));
		
		List<WebElement> tag1 = driver.findElements(By.tagName("a"));
		int count=1;
		for(WebElement i:tag1)
		{
			System.out.println(i.getText()+" : "+i.getAttribute("href"));
			if(count==20)
			{
				break;
			}
			
			count++;
			
		}
	}
}

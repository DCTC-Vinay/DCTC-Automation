package locatorsinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsForLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> x = driver.findElements(By.tagName("a"));
		
		System.out.println("No of Links : "+x.size());
		
		for(WebElement i:x)
		{
			System.out.println(i.getText()+ " : "+i.getAttribute("href"));
		}
		
		
		//For Each Version of For Loop
		int a[]= {2,35,54,26,67,78};
		for(int d:a)
		{
			System.out.println(d);
		}
	}

}

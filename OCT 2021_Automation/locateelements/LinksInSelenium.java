package locateelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//List<WebElement> x = driver.findElements(By.id("ema"));
		
		List<WebElement> n = driver.findElements(By.tagName("a"));
		System.out.println(n.size());
		
		for(WebElement x:n)
		{
			System.out.println(x.getText()+" : "+x.getAttribute("href"));
		}
	}

}

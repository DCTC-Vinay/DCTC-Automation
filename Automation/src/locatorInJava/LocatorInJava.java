package locatorInJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String basePath=System.getProperty("user.dir");
		String actualPath=basePath+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actualPath);
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		
		
		driver1.findElement(By.xpath(""));
		
		//driver1.findElement(By.id("ema"));
	
		List<WebElement> n1=driver1.findElements(By.id("ema"));
		int count1=n1.size();
		// Locating By ID

		driver1.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver1.findElement(By.id("pass")).sendKeys("123");
		Thread.sleep(5000);
		
		String data = driver1.findElement(By.id("email")).getAttribute("value");
		System.out.println(data);
		
		List<WebElement> n = driver1.findElements(By.tagName("a"));
		int count=n.size();
		System.out.println("Links on Page : "+count);
		
		for(WebElement x:n)
		{
			System.out.println(x.getText()+" : "+x.getAttribute("href"));
		}
		
		
		
		
		//Locating By Partial Link Text
		driver1.findElement(By.partialLinkText("password")).click();
		
		//Locating By Link Text
		driver1.findElement(By.linkText("Forgotten password?")).click();
		
		//Locating By Link Tag
		//driver1.findElement(By.tagName("inputtext"));
		
		
		
		
		
		driver1.findElement(By.id("email")).clear();
		driver1.findElement(By.id("pass")).clear();
		
		
		//Locating By Name
		driver1.findElement(By.name("email")).sendKeys("xyz@gmail.com");
		driver1.findElement(By.name("pass")).sendKeys("test");
		Thread.sleep(2000);
		
		//Locating By Class
		//driver1.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("test@gmail.com");
		
		driver1.findElement(By.name("login")).submit();
		
		
	}

}

package navigationmethodsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Fire and Ice')]")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
	
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
	}

}

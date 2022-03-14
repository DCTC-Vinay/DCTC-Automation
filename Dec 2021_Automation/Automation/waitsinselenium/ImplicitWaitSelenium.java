package waitsinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/dynamic-properties");
		
		driver.findElement(By.id("visibleAfter")).click();
		
		System.out.println("Test After Visible Button Click");
	}

}

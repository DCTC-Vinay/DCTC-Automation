package windowsinselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/browser-windows");
		
		String str=driver.getWindowHandle();
		System.out.println(str);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> all_tabs = driver.getWindowHandles();
		
		for(String e:all_tabs)
		{
			System.out.println(e);
			
			if(!e.equals(str))
			{
				driver.switchTo().window(e);
			}
		}
		
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(str);
		
		Thread.sleep(3000);
		driver.quit();
	}

}










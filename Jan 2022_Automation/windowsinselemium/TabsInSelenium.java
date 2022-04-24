package windowsinselemium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		
		String main_tab = driver.getWindowHandle();
		System.out.println(main_tab);
		
		driver.findElement(By.id("tabButton")).click();
		Set<String> all_tabs = driver.getWindowHandles();
		
		for(String x:all_tabs)
		{
			if(!x.contains(main_tab))
			{
				driver.switchTo().window(x);
			}
		}
		
		Thread.sleep(3000);
		String str=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(str);
		
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(main_tab);
		Thread.sleep(3000);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}

package windowinselenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import framesinselenium.FramesInSelenium2;

public class TabsInSelenium {
	
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TabsInSelenium i=new TabsInSelenium();
		i.setup_browser();
		i.locate_tabs();
	//	i.close_browser();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
	}
	
	public void locate_tabs() throws InterruptedException
	{
		String parent_window=driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> all_window = driver.getWindowHandles();
		
		for(String i:all_window)
		{
			if(!i.equals(parent_window))
			{
				driver.switchTo().window(i);
				WebElement t=driver.findElement(By.id("sampleHeading"));
				System.out.println(t.getText());
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		
		
		driver.switchTo().window(parent_window);
		driver.findElement(By.id("windowButton")).click();
		
		all_window = driver.getWindowHandles();
		
		for(String i:all_window)
		{
			if(!i.equals(parent_window))
			{
				driver.switchTo().window(i);
				WebElement t=driver.findElement(By.id("sampleHeading"));
				System.out.println(t.getText());
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent_window);
		driver.findElement(By.id("messageWindowButton")).click();
		all_window = driver.getWindowHandles();
		
		for(String i:all_window)
		{
			if(!i.equals(parent_window))
			{
				driver.switchTo().window(i);
				Thread.sleep(3000);
				driver.close();
			}
		}
	}
	
	public void close_browser()
	{
		driver.quit();
	}
}

package windowinselenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsInSelenium {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WindowsInSelenium w=new WindowsInSelenium();
		w.setup_browser();
		w.test_windows();	
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
	}
	public void test_windows() throws InterruptedException
	{
		String main_page=driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		//driver.findElement(By.id("messageWindowButton")).click();
		
		Set<String> all_windows = driver.getWindowHandles();
		
		for(String n:all_windows)
		{
			if(!n.equals(main_page))
			{
				driver.switchTo().window(n);
				WebElement x=driver.findElement(By.id("sampleHeading"));
				//WebElement x=driver.findElement(By.xpath("//body[starts-with(text(),'Knowledge')]"));
				
				Thread.sleep(5000);
				System.out.println(x.getText());
				driver.close();
				//driver.quit();
			}
		}
	}
}
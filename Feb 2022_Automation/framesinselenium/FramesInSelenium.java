package framesinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInSelenium {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FramesInSelenium i=new FramesInSelenium();
		i.setup_browser();
		i.locate_frame();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
	}
	
	public void locate_frame() throws InterruptedException
	{
		driver.switchTo().frame("frame1");
		WebElement t=driver.findElement(By.id("sampleHeading"));
		System.out.println(t.getText());
		driver.switchTo().defaultContent();
		
		
	}
	
	public void close_browser()
	{
		driver.close();
	}
}

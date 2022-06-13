package framesinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
			
		driver.switchTo().frame("frame1");
		String str=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(str);

		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]//parent::li")).click();
	}

}

package framesinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String basepath=System.getProperty("user.dir");
		String actualpath=basepath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		
		String data=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(data);
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Forms')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Practice Form')]")).click();
		
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
		
		String data1=driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText();
		System.out.println(data1);
		
	}

}

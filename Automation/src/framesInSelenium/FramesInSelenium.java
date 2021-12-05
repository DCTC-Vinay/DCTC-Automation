package framesInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
		String data=driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText();
		System.out.println(data);
		driver.switchTo().defaultContent();
		
		/*
		 * driver.get("https://demoqa.com/frames");
		 * 
		 * driver.switchTo().frame("frame1"); String
		 * str=driver.findElement(By.id("sampleHeading")).getText();
		 * System.out.println(str); driver.switchTo().defaultContent();
		 * 
		 * 
		 * System.out.println("Frame 2 Contents"); driver.switchTo().frame("frame2");
		 * String str1=driver.findElement(By.id("sampleHeading")).getText();
		 * System.out.println(str1); driver.switchTo().defaultContent();
		 * 
		 * driver.get("https://demoqa.com/nestedframes");
		 * driver.switchTo().frame("frame1");
		 * driver.switchTo().frame(driver.findElement(By.
		 * xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
		 */
	}

}

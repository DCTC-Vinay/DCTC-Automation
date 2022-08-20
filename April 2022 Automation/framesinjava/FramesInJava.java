package framesinjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInJava {

	WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FramesInJava f=new FramesInJava();
		f.setup_browser();
		f.test_frame();
		f.lic_mitra();
	}
	
	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
	}
	public void test_frame()
	{
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));
		//driver.switchTo().frame("frame1");
		
		
		  driver.switchTo().frame(3); WebElement
		  s=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		  System.out.println(s.getText());
		  
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame("frame2");
		  s=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		  System.out.println(s.getText());
		  
		  driver.switchTo().defaultContent();
	}
	
	public void lic_mitra()
	{
		driver.navigate().to("https://licindia.in/Customer-Services");
		driver.findElement(By.xpath("//img[@alt='Chat agent button']")).click();
		driver.findElement(By.linkText("Get Started")).click();
		
		driver.switchTo().frame("avaamoIframe");
		driver.findElement(By.linkText("Switch Language")).click();
	}
}







package radioandcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		Thread.sleep(3000);
		WebElement y=driver.findElement(By.xpath("//strong[contains(text(),'Radio')]"));
		System.out.println(y.getText());
		
		driver.findElement(By.id("vfb-7-1")).click();
				
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-7-2")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-7-3")).click();
		
		Thread.sleep(3000);
		
	
		WebElement x=driver.findElement(By.id("vfb-6-0"));
		x.click();
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-6-1")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("vfb-6-2")).click();
		
		Thread.sleep(3000);
		
		
	}

}

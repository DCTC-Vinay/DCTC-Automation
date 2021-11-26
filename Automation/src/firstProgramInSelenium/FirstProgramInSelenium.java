package firstProgramInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgramInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String basePath=System.getProperty("user.dir");
		String actualPath=basePath+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actualPath);
		
	
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\ip-slim-3\\Desktop\\Selenium Browser Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.close();
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver1.close();
		
	}

}

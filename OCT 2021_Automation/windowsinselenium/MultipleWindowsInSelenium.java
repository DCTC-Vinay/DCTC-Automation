package windowsinselenium;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.PropertyFileHelper;

public class MultipleWindowsInSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		String basepath=System.getProperty("user.dir");
		String actualpath=basepath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		PropertyFileHelper pfh=new PropertyFileHelper("test.properties");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(pfh.getPropertyValue("baseUrl"));
		
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> alltabs = driver.getWindowHandles();
		
		for(String each:alltabs)
		{
			if(!each.contains(parentWindow))
			{
				driver.switchTo().window(each);
			}
		}
		
		WebDriverWait wt=new WebDriverWait(driver,10);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("sampleHeading"))));
		
		
		Thread.sleep(3000);
		
		String str=driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(str);
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		
		Thread.sleep(3000);
		driver.findElement(By.id("windowButton")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}

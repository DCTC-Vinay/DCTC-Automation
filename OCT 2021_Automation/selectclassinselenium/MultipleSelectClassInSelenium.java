package selectclassinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectClassInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		String path=System.getProperty("user.dir");
		String actualpath=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement fruit = driver.findElement(By.id("fruit"));
		
		Select sel_fruit=new Select(fruit);
		
		System.out.println(sel_fruit.isMultiple());
		
		sel_fruit.selectByIndex(1);
		sel_fruit.selectByIndex(2);
		
		Thread.sleep(3000);
		sel_fruit.deselectAll();
		
		sel_fruit.selectByValue("orange");
		
		sel_fruit.selectByVisibleText("Apple");
		
	}

}

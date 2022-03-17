package actionclassinselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(5000);
		
		WebElement right_click = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		
		Actions ac=new Actions(driver);
		//ac.contextClick(right_click).build().perform();
		ac.moveToElement(right_click).contextClick().build().perform();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		
		WebElement double_click = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		//ac.doubleClick(double_click).build().perform();
		ac.moveToElement(double_click).doubleClick().build().perform();
		
		Thread.sleep(5000);
		
		Alert al=driver.switchTo().alert();
		al.accept();
		
		
		
	}

}





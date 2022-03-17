package actionclassinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//Thread.sleep(5000);
		
		WebElement element1 = driver.findElement(By.id("credit2"));
		WebElement element2 = driver.findElement(By.id("bank"));
		
		//Thread.sleep(3000);
		Actions ac=new Actions(driver);
		ac.dragAndDrop(element1, element2).build().perform();
		
		//Thread.sleep(3000);
		WebElement element3 = driver.findElement(By.id("fourth"));
		WebElement element4 = driver.findElement(By.id("amt7"));
		
		ac.dragAndDrop(element3, element4).build().perform();
		
		
		//Thread.sleep(3000);
		WebElement element5 = driver.findElement(By.id("credit1"));
		WebElement element6 = driver.findElement(By.id("loan"));
		
		ac.dragAndDrop(element5, element6).build().perform();
		
		//Thread.sleep(3000);
		WebElement element7 = driver.findElement(By.id("fourth"));
		WebElement element8 = driver.findElement(By.id("amt8"));
		
		ac.dragAndDrop(element7, element8).build().perform();
		
	}

}









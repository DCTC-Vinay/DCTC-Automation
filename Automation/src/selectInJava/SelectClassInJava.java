package selectInJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		WebElement color = driver.findElement(By.id("oldSelectMenu"));

		Select dropDownColor = new Select(color);
		Thread.sleep(1500);
		dropDownColor.selectByValue("2");

		Thread.sleep(1500);
		dropDownColor.selectByVisibleText("Black");

		WebElement country = driver.findElement(By.name("country"));
		Select dropDown = new Select(country);

		Thread.sleep(3000);
		dropDown.selectByIndex(3);
		Thread.sleep(3000);
		dropDown.selectByValue("BAHAMAS");
		Thread.sleep(3000);
		 
		
		
		
	}

}

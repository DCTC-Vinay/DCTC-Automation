package multipleSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectInJava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement multiple = driver.findElement(By.id("fruits"));
		
		Select multiValue=new Select(multiple);
		
		System.out.println(multiValue.isMultiple());
		
		multiValue.selectByIndex(0);
		Thread.sleep(1500);
		multiValue.selectByIndex(1);
		Thread.sleep(1500);
		multiValue.deselectByVisibleText("Apple");
		
		
	}

}

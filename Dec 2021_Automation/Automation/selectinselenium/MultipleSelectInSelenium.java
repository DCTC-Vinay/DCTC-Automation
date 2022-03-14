package selectinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruit=driver.findElement(By.id("fruits"));
		Select sel_fruit=new Select(fruit);
		
		System.out.println("Select Multiple : "+sel_fruit.isMultiple());
		
		Thread.sleep(3000);
		sel_fruit.selectByIndex(2);
		
		Thread.sleep(3000);
		sel_fruit.selectByIndex(1);
		
		Thread.sleep(3000);
		sel_fruit.deselectAll();
		
		Thread.sleep(5000);
		sel_fruit.selectByValue("grape");
		
		Thread.sleep(5000);
		sel_fruit.selectByVisibleText("Banana");
		
		
	}

}

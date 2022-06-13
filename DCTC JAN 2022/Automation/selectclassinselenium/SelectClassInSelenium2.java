package selectclassinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassInSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement x=driver.findElement(By.id("fruits"));
		Select sel=new Select(x);
		
		System.out.println(sel.isMultiple());
		
		Thread.sleep(3000);
		sel.selectByIndex(1);
		
		Thread.sleep(3000);
		sel.selectByIndex(3);
		
		Thread.sleep(3000);
		sel.deselectAll();
	}

}

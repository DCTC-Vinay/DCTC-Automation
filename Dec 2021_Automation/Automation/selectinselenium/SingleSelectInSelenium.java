package selectinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		
		
		WebElement country=driver.findElement(By.name("country"));
		Select sel_country=new Select(country);
		
		Thread.sleep(3000);
		sel_country.selectByIndex(5);
		
		System.out.println("Select Multiple : "+sel_country.isMultiple());
		
		Thread.sleep(5000);
		sel_country.selectByValue("INDIA");
		
		Thread.sleep(5000);
		sel_country.selectByVisibleText("KAZAKHSTAN");
		
		
	}

}

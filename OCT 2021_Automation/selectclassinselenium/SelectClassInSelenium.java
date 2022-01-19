package selectclassinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassInSelenium {
	
	public static void main(String[] args) {
		String path=System.getProperty("user.dir");
		String actualpath=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		
		Select sel_country=new Select(country);
		
		System.out.println(sel_country.isMultiple());
		
		sel_country.selectByIndex(2);
		
		sel_country.selectByValue("ANTARCTICA");
		
		sel_country.selectByVisibleText("");
	}

}

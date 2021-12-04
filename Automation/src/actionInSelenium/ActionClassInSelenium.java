package actionInSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Resource\\test.properties";
		
		File f=new File(actual_path);
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties pr=new Properties();
		pr.load(fis);
		
		String value = pr.getProperty("baseUrl");
		driver.get(value+"buttons");
		
		Actions ac=new Actions(driver);
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		
		ac.doubleClick(btnDoubleClick).build().perform();
		ac.contextClick(driver.findElement(By.id("rightClickBtn"))).build().perform();
	
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Check Box')]"))).click().build().perform();
	}

}









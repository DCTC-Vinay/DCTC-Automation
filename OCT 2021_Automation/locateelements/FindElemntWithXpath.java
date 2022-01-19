package locateelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemntWithXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // display window in maximize
		driver.get("https://www.facebook.com/"); // it will redirect to given URL
		
		
		driver.findElement(By.xpath("//a[starts-with(@title,'Take')]")).click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("test@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("12345");
		
	}

}

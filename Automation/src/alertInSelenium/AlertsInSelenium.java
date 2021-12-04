package alertInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
		
		driver.findElement(By.id("promtButton")).click();
		alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.sendKeys("Welcome to Selenium Alert");
		alt.accept();
		String data = driver.findElement(By.id("promptResult")).getText();
		System.out.println(data);
	}

}

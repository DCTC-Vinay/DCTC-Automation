package radioandcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\May Batch Automation\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement option1=driver.findElement(By.id("vfb-7-1"));
		System.out.println(option1.getAttribute("value"));
		
		Thread.sleep(3000);
		option1.click();
		
		WebElement option2=driver.findElement(By.id("vfb-7-2"));
		System.out.println(option2.getAttribute("value"));
		
		Thread.sleep(3000);
		option2.click();
		
		WebElement option3=driver.findElement(By.id("vfb-7-3"));
		System.out.println(option3.getAttribute("value"));
		
		Thread.sleep(3000);
		option3.click();
		
		System.out.println(driver.getTitle());
		
		System.out.println("Option1:"+option1.isSelected());
		System.out.println("Option2:"+option2.isSelected());
		System.out.println("Option3:"+option3.isSelected());
	}

}

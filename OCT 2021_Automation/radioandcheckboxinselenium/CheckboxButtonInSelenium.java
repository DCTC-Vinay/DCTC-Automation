package radioandcheckboxinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxButtonInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String path=System.getProperty("user.dir");
		String actualpath=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/radio-button");
		
		WebElement option3 = driver.findElement(By.id("noRadio"));
		System.out.println(option3.isDisplayed());
		System.out.println("Selected Option1: "+option3.isSelected());
		System.out.println("Enabled Option1: "+option3.isEnabled());
		Thread.sleep(3000);
		option3.click();
		
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		System.out.println(option1.isDisplayed());
		System.out.println("Selected Option1: "+option1.isSelected());
		
		
		Thread.sleep(3000);
		option1.click();
		
		System.out.println("Selected Option1: "+option1.isSelected());
		
		System.out.println("Enabled Option1: "+option1.isEnabled());
		
		
		WebElement option2 = driver.findElement(By.id("vfb-6-1"));
		System.out.println(option2.isDisplayed());
		System.out.println("Selected Option2: "+option2.isSelected());
		
		
		Thread.sleep(3000);
		option2.click();
		
		System.out.println("Selected Option2: "+option2.isSelected());
		
		
	}

}

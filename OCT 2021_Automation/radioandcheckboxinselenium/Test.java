package radioandcheckboxinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String path=System.getProperty("user.dir");
		String actualpath=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		
		//WebElement option1 = driver.findElement(By.xpath("//button[@type='button' and @class='rct-collapse rct-collapse-btn']"));
		WebElement option1 = driver.findElement(By.xpath("//button[@title='Toggle']"));
		Thread.sleep(3000);
		option1.click();

		//WebElement option2=driver.findElement(By.xpath("//input[@id='tree-node-desktop']//parent::label//preceding-sibling::button"));
		WebElement option2=driver.findElement(By.xpath("//input[@id='tree-node-desktop']//parent::label//preceding-sibling::button"));
		Thread.sleep(3000);
		option2.click();
		
		WebElement option3=driver.findElement(By.xpath("//*[contains(text(),'Notes')]"));
		Thread.sleep(3000);
		option3.click();
		
		WebElement option4=driver.findElement(By.xpath("//*[contains(text(),'Commands')]"));
		Thread.sleep(3000);
		option4.click();
	}

}

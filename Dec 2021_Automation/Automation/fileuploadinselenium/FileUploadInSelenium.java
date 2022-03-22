package fileuploadinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\ip-slim-3\\Desktop\\DataRead.xlsx");
		
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();
	}

}

package fileupload;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import windowinselenium.TabsInSelenium;

public class FileUploadInSelenium {
	
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FileUploadInSelenium i=new FileUploadInSelenium();
		i.setup_browser();
		i.locate_file();
	//	i.close_browser();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/upload/");
	}
	
	public void locate_file() throws InterruptedException
	{
		String file_path="C:\\Users\\ip-slim-3\\Desktop\\doc.txt";
		driver.findElement(By.id("uploadfile_0")).sendKeys(file_path);
		Thread.sleep(3000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("submitbutton")).click();
	}
	
	public void close_browser()
	{
		driver.quit();
	}
}

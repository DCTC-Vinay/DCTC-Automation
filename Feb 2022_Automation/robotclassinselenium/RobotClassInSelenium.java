package robotclassinselenium;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.*;

public class RobotClassInSelenium {

	WebDriver driver;
	String path="";
	String chrome_path="";
	String file_input="";
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		RobotClassInSelenium i=new RobotClassInSelenium();
		i.setup_browser();
		i.locate_file();
	}

	public void setup_browser() throws IOException
	{
		path=System.getProperty("user.dir");
		chrome_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chrome_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/upload/");
		
	}
	
	public void locate_file() throws InterruptedException, AWTException
	{
		WebElement in=driver.findElement(By.id("uploadfile_0"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(in).click().build().perform();
		
		file_input=path+"\\Driver\\Test123.xlsx";
		
		StringSelection str=new StringSelection(file_input);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
		
		Thread.sleep(3000);
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.id("terms")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("submitbutton")).click();
	}
	
	public void close_browser()
	{
		driver.close();
	}
}

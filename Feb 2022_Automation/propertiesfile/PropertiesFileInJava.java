package propertiesfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFileInJava {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		PropertiesFileInJava i=new PropertiesFileInJava();
		i.setup_browser();
	}

	public void setup_browser() throws IOException
	{
		String path=System.getProperty("user.dir");
		
		String actual_path=path+"\\Driver\\test.properties";
		String chrome_path=path+"\\Driver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", chrome_path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		FileReader r=new FileReader(actual_path);
		Properties p=new Properties();
		p.load(r);
		
		String base_url_value=p.getProperty("base_url");
		driver.get(base_url_value);
		
		String msg=driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
		String title_of_webpage=driver.getTitle();
		
		FileWriter fw=new FileWriter(actual_path);
		
		p.setProperty("message",msg);
		p.setProperty("title", title_of_webpage);
		p.store(fw, "Test for title");
	}
	
	public void close_browser()
	{
		driver.close();
	}
	
}

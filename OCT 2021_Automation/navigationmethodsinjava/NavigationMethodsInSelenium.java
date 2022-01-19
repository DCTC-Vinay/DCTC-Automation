package navigationmethodsinjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodsInSelenium {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		String path = System.getProperty("user.dir");
		String actual_path = path + "\\Resource\\test.properties";
		File f = new File(actual_path);
		FileInputStream fin = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fin);

		String url = pr.getProperty("baseUrl");
		
		String basepath=System.getProperty("user.dir");
		String actualpath=basepath+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("item-0")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}

}

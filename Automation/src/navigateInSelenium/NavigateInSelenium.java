package navigateInSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInSelenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Resource\\test.properties";
		
		File f=new File(actual_path);
		
		FileInputStream fis=new FileInputStream(f);
		
		Properties pr=new Properties();
		pr.load(fis);
		
		String url = pr.getProperty("baseUrl");
		
		String basePath = System.getProperty("user.dir");
		String actualPath = basePath + "\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualPath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@class='card-body']//h5[contains(text(),'Elements')]")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.findElement(By.xpath("//*[contains(text(),'Text Box')]")).click();
		driver.navigate().refresh();
	}

}

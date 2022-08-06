package firstautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondProgram {

	WebDriver driver;
	WebDriver driver1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondProgram s=new SecondProgram();
		s.chrome_browser();
		s.firefox_browser();
	}
	
	public void firefox_browser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\geckodriver.exe");
		driver1=new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		String title1=driver1.getTitle();
		System.out.println(title1);
		driver1.close();
	}
	
	public void chrome_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
}

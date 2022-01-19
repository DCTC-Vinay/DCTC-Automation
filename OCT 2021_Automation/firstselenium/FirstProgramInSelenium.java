package firstselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgramInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FirstProgramInSelenium f=new FirstProgramInSelenium();
		f.setup();
		
	}
	
	void setup()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // display window in maximize
		driver.get("https://www.facebook.com/"); // it will redirect to given URL
		driver.close(); //it will the chrome browser

		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Selenium Browser Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize(); // display window in maximize
		driver1.get("https://www.gmail.com/"); // it will redirect to given URL

	}

}

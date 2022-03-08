package firstprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstProgram f=new FirstProgram();
		f.setup();
	}
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		//driver.close();
	}

}

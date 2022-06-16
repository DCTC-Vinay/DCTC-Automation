package framesinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInSelenium2 {

	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FramesInSelenium2 i=new FramesInSelenium2();
		i.setup_browser();
		i.locate_frame();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
	}
	
	public void locate_frame() throws InterruptedException
	{
		//switch for parent
		driver.switchTo().frame("frame1");
		
		//switch for Child
		WebElement j=driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(j);
		
		WebElement t=driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]"));
		System.out.println(t.getText());
		
		
	}
	
	public void close_browser()
	{
		driver.close();
	}
}

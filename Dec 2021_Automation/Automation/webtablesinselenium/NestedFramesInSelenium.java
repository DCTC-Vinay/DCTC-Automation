package webtablesinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Child Iframe')]")).getText());
		
		//driver.switchTo().defaultContent();
		
		driver.navigate().refresh();
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]")).getText());
	}

}

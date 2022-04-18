package tablesinselenium;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> list_of_company = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		System.out.println(list_of_company.size());
		
		for(WebElement i:list_of_company)
		{
			String company=i.findElement(By.xpath("td[1]")).getText();
			if(company.contains("Bank"))
			{
				String cur_price=i.findElement(By.xpath("td[4]")).getText();
				
				System.out.println(company + " : "+cur_price);
			}
		}
	}

}

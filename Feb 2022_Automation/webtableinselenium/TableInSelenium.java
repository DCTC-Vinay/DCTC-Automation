package webtableinselenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import waitsinselenium.ImplicitWaitInSelenium;

public class TableInSelenium {
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		TableInSelenium i=new TableInSelenium();
		i.setup_browser();
		i.locate_table();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	}
	
	public void locate_table() throws InterruptedException
	{
		List<WebElement> list_of_company = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		for(WebElement j:list_of_company)
		{
			String company_name=j.findElement(By.xpath("td[1]")).getText();
			if(company_name.contains("Ltd"))
			{
				String cur_price=j.findElement(By.xpath("td[4]")).getText();
				
				System.out.println(company_name+" : "+cur_price);
			}
		}
	}
	
	public void close_browser()
	{
		driver.close();
	}
}







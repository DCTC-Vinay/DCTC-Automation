package webtablesinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		String actualpath=path+"\\Driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actualpath);
		
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		System.out.println(rows.size());
		
		for(WebElement each:rows)
		{
			String company_name=each.findElement(By.xpath("td[1]")).getText();
			System.out.println(company_name);
			
			if(company_name.contains("Bank"))
			{
				String current_price=each.findElement(By.xpath("td[4]")).getText();
				
				System.out.println(current_price);
			}
		}
	}

}

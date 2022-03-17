package webtablesinselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesInselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement company_name=driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
		
		System.out.println(company_name.getText());
		
		List<WebElement> table_row = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		
		for(WebElement x:table_row)
		{
			System.out.println(x.findElement(By.xpath("td[1]")).getText());
		}
		
	}

}







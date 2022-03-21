package datetimepickerinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateTimePickerInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String path=System.getProperty("user.dir");
		String actual_path=path+"\\Driver\\chromedriver.exe";
	
		System.setProperty("webdriver.chrome.driver", actual_path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/date-picker");
		
	//	Use This as alternative approach from Line no. 24 to 26
		
		//WebElement w=driver.findElement(By.id("datePickerMonthYearInput"));
		//w.clear();
		//w.sendKeys("06/21/2008");
		
		Thread.sleep(3000);
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Thread.sleep(3000);
		Select s_month=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		s_month.selectByValue("5");
		
		Thread.sleep(3000);
		Select s_year=new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		s_year.selectByValue("2008");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--021 react-datepicker__day--weekend']")).click();
	}

}

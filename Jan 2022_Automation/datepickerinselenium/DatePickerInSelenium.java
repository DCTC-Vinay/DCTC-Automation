package datepickerinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/date-picker");
		
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		
		Select year_select=new Select(year);
		Thread.sleep(3000);
		year_select.selectByValue("2020");
		
		WebElement month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select month_select=new Select(month);
		Thread.sleep(3000);
		month_select.selectByVisibleText("June");
		
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--023']")).click();
	}

}

package calendarinselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class DatePickerInSelenium {
	
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DatePickerInSelenium i=new DatePickerInSelenium();
		i.setup_browser();
		i.locate_date();
	//	i.close_browser();
	}

	public void setup_browser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Feb 2022\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/date-picker");
	}
	
	public void locate_date() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		Thread.sleep(3000);
		WebElement sel_tag_month=driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select month=new Select(sel_tag_month);
		month.selectByVisibleText("June");
		
		Thread.sleep(3000);
		WebElement sel_tag_year=driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select year=new Select(sel_tag_year);
		year.selectByValue("2024");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--018']")).click();
	}
	
	public void close_browser()
	{
		driver.quit();
	}
}

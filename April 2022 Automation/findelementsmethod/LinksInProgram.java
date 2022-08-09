package findelementsmethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksInProgram {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinksInProgram li=new LinksInProgram();
		li.find_links();
	}
	
	public void find_links()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ip-slim-3\\eclipse-workspace\\DCTC DEC-21\\April 22 Automation\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		int n=tag.size();
		
		for(WebElement x:tag)
		{
			System.out.println(x.getText()+" : "+x.getAttribute("href"));
		}
	}
}

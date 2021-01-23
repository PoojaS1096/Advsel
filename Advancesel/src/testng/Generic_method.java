package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_method
{
	WebDriver driver;
	@BeforeMethod
	public void open_app()
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		//driver.get("https://www.flipkart.com/");
		
	}
	@AfterMethod
	public void close_app() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.close();		
	}
}
		
	
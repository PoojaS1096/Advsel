package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pom.Login_page;

public class Pom_concept
{
	@Test
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		Login_page rt=new Login_page(driver);
		rt.clickLogin();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		rt.clickLogin();
	}

}

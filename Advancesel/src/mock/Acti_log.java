package mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_log 
{
	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");  
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();	
	    driver.quit();
	}
}

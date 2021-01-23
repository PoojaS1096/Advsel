package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_popup {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@pid='1']")).click();
		Thread.sleep(2000);
		
		
		//<svg class="gb_6e"
		// TODO Auto-generated method stub

	}

}

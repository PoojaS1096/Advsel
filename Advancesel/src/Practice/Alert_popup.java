package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

	public static void main(String[] args) throws InterruptedException
  {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dummy");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	   Alert ala = driver.switchTo().alert();
	   String text = ala.getText();
	   System.out.println(text);
	   ala.accept();
	
	
		driver.close();
		// TODO Auto-generated method stub

	}

}

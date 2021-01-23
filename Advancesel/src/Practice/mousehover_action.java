package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover_action {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span [@class='icp-nav-link-inner']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		WebElement ele1 =driver.findElement(By.xpath("//span [@class='nav-text']"));
		ele1.click();
	
		//<span class="nav-text"
		
		
		//<span class="icp-nav-link-inner">
		
		// TODO Auto-generated method stub

	}

}

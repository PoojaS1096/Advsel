package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_clk_me {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//button [.='Double-Click Me To See Alert']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.doubleClick(ele).perform();
	    //act.contextClick(ele).perform();
		Thread.sleep(2000);
	    driver.close(); 
	    
		// TODO Auto-generated method stub

	}

}

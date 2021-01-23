package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class filedwnld_popup {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{

		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.selenium.dev/");
		driver.get("https://anydesk.com/en/downloads/windows");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='download-button webdriver']")).click();
		WebElement ele = driver.findElement(By.xpath("//p[@class='mb-0 float-left']"));
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		 driver.findElement(By.xpath("//a[@id='download-modal-link']")).click();
	    //driver.findElement(By.xpath("//a[@href='https://selenium-release.storage.googleapis.com/3.141/selenium-server-standalone-3.141.59.jar']")).click();

		Robot R = new Robot();
		R.keyPress(KeyEvent.VK_LEFT);
		R.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(2000);
		R.keyPress(KeyEvent.VK_ENTER);
		R.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.close();
		// TODO Auto-generated method stub

	}

}

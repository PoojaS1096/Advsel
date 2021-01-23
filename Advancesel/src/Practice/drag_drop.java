package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_drop {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div [@id='box1']"));
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='box106']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
	    act.dragAndDrop(ele,ele1).perform();
		Thread.sleep(2000);
	    driver.close(); 

		// TODO Auto-generated method stub

	}

}

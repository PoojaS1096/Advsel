package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pavithra/Desktop/pooja/notepad/mainpage.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='t1']")).sendKeys("poojas");
		//driver.switchTo().frame("f1");
		Thread.sleep(2000);
	    driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='t2']")).click();
		driver.switchTo().frame("f2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='t3']")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='t2']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='t1']")).clear();
		Thread.sleep(2000);
		driver.quit();
	 }
}

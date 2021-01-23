package generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Flipkart extends Generic_test
{
	@Test
	public void test1() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8904918042");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Fade@100");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();	
	}
}

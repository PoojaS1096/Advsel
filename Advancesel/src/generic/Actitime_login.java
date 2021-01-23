package generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.Generic_test;

public class Actitime_login extends Generic_test
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();	
	}
}

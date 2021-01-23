package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Generic_test;

public class Actitime_login extends Generic_method
{
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();	
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"actiTIME - Enter Time-Track");
		System.out.println(1);
	}
}

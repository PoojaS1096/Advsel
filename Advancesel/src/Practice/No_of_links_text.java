package Practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class No_of_links_text
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
	// 	List<WebElement> links = driver.findElements(By.tagName("img"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		for(WebElement we:links)//(WebElement we:images)
		{
			//String text = we.getAttribute("src");
			//String text = we.getText();
			String text = we.getAttribute("href");
			System.out.println(text);
		}
	}

}

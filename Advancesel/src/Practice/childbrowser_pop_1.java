package Practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser_pop_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukari.com/");
		Thread.sleep(2000);
		Set<String> allwh=driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
			
		}
		
	}

}

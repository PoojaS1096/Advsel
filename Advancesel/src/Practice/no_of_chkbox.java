package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class no_of_chkbox {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Pavithra/Desktop/pooja/notepad/noofchkbx.html");
		Thread.sleep(2000);
		List<WebElement> chbx=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int count = chbx.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++)
		{
			if(i%2==0)
			{
		    WebElement we=chbx.get(i);
		    we.click();
			}
		}
		  
		 for(int i=0;i<=count-1;i++)
		//for(int i=count-1;i>=0;i--)
		{
			 if(i%2==0)
			 {
			   WebElement we1=chbx.get(i);
			   we1.click();
			 }
		}
	}

}

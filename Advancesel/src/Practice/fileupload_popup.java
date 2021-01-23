package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class fileupload_popup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		//driver.get("file:///C:/Users/Pavithra/Desktop/pooja/notepad/fileupload.html");
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("u_0_b"));
		 // WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
	//	ele.sendKeys("C:\\Users\\Pavithra\\Desktop\\YUVA PRASAD S RESUME.docx");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		String title=driver.getTitle();
		System.out.println(title);
			driver.close();

	}

}

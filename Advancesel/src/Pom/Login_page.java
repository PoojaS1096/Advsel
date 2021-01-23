package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	    //declaration
		@FindBy(xpath="//button[@type='submit']")
		private WebElement loginbtn;
		
		//initialization
		public Login_page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization
		public void clickLogin()
		{
			loginbtn.click();
		}

}

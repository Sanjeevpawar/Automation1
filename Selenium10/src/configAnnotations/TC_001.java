package configAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TC_001 extends BaseClass {

	@Test
	public void script() throws InterruptedException
	{
		//  Enter userName in username text field
		driver.findElement(By.name("user_name")).sendKeys(username);
		
		// Enter password in password text field
		driver.findElement(By.name("user_password")).sendKeys(password);
		
		// Click on Login Button
		driver.findElement(By.id("submitButton")).click();
		
		// Verify Home page is displayed
		boolean homepage = driver.findElement(By.partialLinkText("Calendar")).isDisplayed();
		
		if(homepage==true)
		{
			Reporter.log("Home page is displayed");
			
		}
		else
		{
			Reporter.log("Home page not displayed");
		}
		
		Thread.sleep(2000);
		
	
	
	
	}
}

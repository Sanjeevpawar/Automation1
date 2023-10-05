package configAnnotations;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_002 extends BaseClass{
	
	@Test
	public void leadspageDisplayed() throws InterruptedException
	{
		
	//7) Click on Leads Link
	driver.findElement(By.linkText("Leads")).click();
	boolean leadspage = driver.findElement(By.xpath("//b[text()='Search for']")).isDisplayed();
	if(leadspage==true)
	{
		Reporter.log("Leads page is displayed");
	}
	else
	{
		Reporter.log("Failed- lead page not displayed");
	}
}
}

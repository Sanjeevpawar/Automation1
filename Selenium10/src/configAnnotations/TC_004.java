package configAnnotations;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_004 extends BaseClass {
	
	@Test
	public void leadCreatedPage() throws InterruptedException
	{
		Thread.sleep(2000);
	//10) Verify create lead page is displayed
	boolean LeadsCreationButton = driver.findElement(By.xpath("//img[@title='Create Lead...']")).isDisplayed();
	if(LeadsCreationButton==true)
	{
		System.out.println("Leads creation page is displayed");
	}
	else
	{
		System.out.println("Failed- Leads creation page is NOT displayed");
	}

	}
}

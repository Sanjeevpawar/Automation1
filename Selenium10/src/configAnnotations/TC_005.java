package configAnnotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_005 extends BaseClass{

	
	@Test
	public void enterData() throws InterruptedException
	{
		Thread.sleep(2000);
	//11) Enter firstname in firstname textfield
	driver.findElement(By.name("firstname")).sendKeys("Putin");
	

	//12) Enter lastname in lastname textfield(*)
	driver.findElement(By.name("lastname")).sendKeys("k");
	
	
	//13) Enter Company in Company textfield(*)
	driver.findElement(By.name("company")).sendKeys("Infosys");
	
	
	//14) Enter title in title text field
	driver.findElement(By.id("designation")).sendKeys("QA Lead");
	
	//15) Enter Annual Revenue in Annual Revenue text field
		driver.findElement(By.name("annualrevenue")).sendKeys("12345");
	
		
	//16) Enter No of employees in no of employees text field
	driver.findElement(By.id("noofemployees")).sendKeys("150");
	
	
	//17) Enter mobile no in mobile no textfield
	driver.findElement(By.id("mobile")).sendKeys("9986223311");
	
	
	//18) Enter email in email text field
	driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");
	
	
	//19) Select a "lead status" from lead statu drop down
	 WebElement listbox = driver.findElement(By.name("leadstatus"));
	Select selectOption=new Select(listbox);
	selectOption.selectByValue("Cold");
	
	
	//20) Click on group radio button in assigned to field
	driver.findElement(By.xpath("//input[@value='T']")).click();
	
	
	//21) Select "assigned to" from assigned to dropdown(*)
	WebElement assigndropdown = driver.findElement(By.name("assigned_group_id"));
	Select abc=new Select(assigndropdown);
	abc.selectByVisibleText("Marketing Group");
	
	
	//22) Enter Street details into street  text field
	driver.findElement(By.name("lane")).sendKeys("Victoria street");
	
	
	//24) Enter country in countrt text field
	driver.findElement(By.id("country")).sendKeys("India");
	
	//25) Enter city in city text field
	driver.findElement(By.id("city")).sendKeys("Bengaluru");
	
	//26) Enter State in state textfield
	driver.findElement(By.id("state")).sendKeys("Karnataka");
	
	//27) Click on Save button.
	driver.findElement(By.name("button")).click();
	

	//28) Verify the lead information title is displayed
	boolean LeadInfo = driver.findElement(By.xpath("//span[contains(text(),'Lead Information')]")).isDisplayed();
	if(LeadInfo==true)
	{
		Reporter.log("Lead information is displayed");
	}
	else
	{
		Reporter.log("Failed-Lead information NOT displayed");
	}
	
}
}
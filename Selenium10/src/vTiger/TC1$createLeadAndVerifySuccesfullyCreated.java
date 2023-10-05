package vTiger;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1$createLeadAndVerifySuccesfullyCreated {

	private static final boolean True = false;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		System.out.println("########################### Script Started ###################################");

		// 1)Open browser and navigate to vTiger application
		driver.get("http://localhost:8888");
		
		//2) Verify Login Page is displayed
		boolean loginpage = driver.findElement(By.name("user_name")).isDisplayed();
		if(loginpage=true)
		{
			System.out.println("Login Page displayed");
		}
		else
		{
			System.out.println("Failed- login page not displayed");
			driver.quit();
		}
		
		// 3) Enter userName in username text field
		driver.findElement(By.name("user_name")).sendKeys("admin");
		
		//4)  Enter password in password text field
		driver.findElement(By.name("user_password")).sendKeys("manager");
		
		//5) Click on Login Button
		driver.findElement(By.id("submitButton")).click();
		
		//6)Verify Home page is displayed
		boolean homepage = driver.findElement(By.partialLinkText("Calendar")).isDisplayed();
		
		if(homepage==true)
		{
			System.out.println("Home page is displayed");
			
		}
		else
		{
			System.out.println("Failed- Home page not displayed");
		}
		
		Thread.sleep(2000);
		//7) Click on Leads Link
		driver.findElement(By.linkText("Leads")).click();
		
		// 8) Verify leads page is displayed
		boolean leadspage = driver.findElement(By.xpath("//b[text()='Search for']")).isDisplayed();
		if(leadspage==true)
		{
			System.out.println("Leads page is displayed");
		}
		else
		{
			System.out.println("Failed- Leads page Not displayed");
		}
		
		//9)Click on create lead (+) button
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		
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
		
		//11) Enter firstname in firstname textfield
		driver.findElement(By.name("firstname")).sendKeys("Putin");
		//12) Enter lastname in lastname textfield(*)
		driver.findElement(By.name("lastname")).sendKeys("k");
		//13) Enter Company in Company textfield(*)
		driver.findElement(By.name("company")).sendKeys("Infosys");
		//14) Enter title in title textfield
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
			System.out.println("Lead information is displayed");
		}
		else
		{
			System.out.println("Failed-Lead information NOT displayed");
		}
		
		System.out.println("########################### Script ends ###################################");
		
		
		
		
		
		

		
		
		
	}

}

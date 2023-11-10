package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {

	public WebDriver driver;
	@Parameters("browserName")
	
	@BeforeClass
	public void launchBrowser(String browserName)
	{
		
		if(browserName.equals("edge"))
		{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		driver= new EdgeDriver();
		Reporter.log("Browser is Launched", true);
		}
		else if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver= new ChromeDriver();
			Reporter.log("Browser is Launched", true);
		}
		else
		{
			System.out.println("Browser is invalid");
		}
	
		driver.manage().window().maximize();
		Reporter.log("Browser is Maximized",true);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}

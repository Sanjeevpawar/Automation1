package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Oppo_002 {
	
	@Test
	public void openingOppo()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Reporter.log("Browser is Launched", true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is Maximized",true);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.oppo.com/in");
		Reporter.log("Opened oppo page",true);
		
		driver.close();
		Reporter.log("Browser closed",true);
		
	
	}

}

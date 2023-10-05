package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_mi_004 {
	@Test
	public void openingMI()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		Reporter.log("Browser is Launched", true);
		
		driver.manage().window().maximize();
		Reporter.log("Browser is Maximized",true);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.mi.com/in");
		Reporter.log("Opened MI page",true);
		
		driver.close();
		Reporter.log("Browser closed",true);
		
	
	}

}

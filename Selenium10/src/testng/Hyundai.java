package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hyundai {
	@Test
	public void kia()
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	Reporter.log("Browser is Launched", true);
	
	driver.manage().window().maximize();
	Reporter.log("Browser is Maximized",true);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.hyundai.com");

}

}

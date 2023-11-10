package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class bmw extends BaseClass{
	
	@Test
	public void bmwcar()
	{
	
	driver.get("https://www.bmw.com");
	
	}
	
	
}

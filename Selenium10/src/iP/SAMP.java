package iP;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SAMP {
	public ChromeDriver driver;
	
	@Test
	public void display()
	{
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver.manage().window().maximize();
		
		
		
	}

}

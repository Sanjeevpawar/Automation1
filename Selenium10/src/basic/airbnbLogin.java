package basic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class airbnbLogin {
	
	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.airbnb.com");
		driver.findElement(By.xpath("//button[@data-testid='cypress-headernav-profile']")).click();
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		//rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);	
		rob.keyPress(KeyEvent.VK_TAB);
		//rob.keyPress(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_ENTER);	
		
		
		
	}

}

package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickAndHold {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElementById("userName").sendKeys("abcd");
		driver.findElementById("password").sendKeys("12345");
		
		Actions c=new Actions(driver);
		c.moveByOffset(1635,385).clickAndHold().perform();
		
		
		
	}

}

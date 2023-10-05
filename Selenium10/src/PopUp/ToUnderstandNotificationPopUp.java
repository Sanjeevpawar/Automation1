package PopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToUnderstandNotificationPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions abc=new ChromeOptions();
		abc.addArguments("-disable-notifications");
		ChromeDriver driver=new ChromeDriver(abc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		 Set<String> win = driver.getWindowHandles();
		 
		 
		 for(String all:win)
		 {
			driver.switchTo().window(all);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Time"))
			{
				driver.findElement(By.linkText("Try Free")).click();
				
			}
		 }
	
	}

}

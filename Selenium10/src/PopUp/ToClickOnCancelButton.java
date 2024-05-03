package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToClickOnCancelButton {

	public static void main(String[] args) throws InterruptedException {

			
     	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions obj=new Actions(driver);
		driver.get("https://licindia.in/branch");
		WebElement login = driver.findElement(By.partialLinkText("Login"));
		
		obj.moveToElement(login).perform();
	    driver.findElement(By.linkText("Agent Portal")).click();
	    Thread.sleep(2000);
	    
	    Alert alert=driver.switchTo().alert();
	    
	    System.out.println(alert.getText());
	 
	   
	   
		
	}

}

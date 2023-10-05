package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(14,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.findElement(By.xpath("//button[contains(text(),'Click me, to Open an alert after 5 seconds')]")).click();
		//driver.switchTo().alert().
	//	WebDriverWait abc = new WebDriverWait(driver,10);
		
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("########################Script execution completed#####################################");
		
		

		
		
		
	}

}

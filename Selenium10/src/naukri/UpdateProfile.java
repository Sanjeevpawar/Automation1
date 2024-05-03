package naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateProfile {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("########################### Script Started ###################################");

		// 1)Open browser and navigate to vTiger application
		driver.get("https://www.naukri.com/mnjuser/profile?id=&altresid");
		
		driver.findElement(By.id("usernameField")).sendKeys("sanjeevpawar19@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Seltoshtx@123");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		//driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__bars']")).click();
		driver.findElement(By.partialLinkText("View")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'editOneTheme')]")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Eg. 4,50,000')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Eg. 4,50,000')]")).sendKeys("1");
		
		Thread.sleep(3000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll down till the bottom of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.id("saveBasicDetailsBtn")).click();
		//driver.findElement(By.)
		boolean updated = driver.findElement(By.xpath("//span[contains(text(),'Today')]")).isDisplayed();
		if(updated==true)
		{
			System.out.println("Profile updated succesfully");
			
		}
		else
		{
			System.out.println("Failed- Profile updation");
		}
		
		System.out.println("############################# Script ended #######################################");
		
		
	}

}

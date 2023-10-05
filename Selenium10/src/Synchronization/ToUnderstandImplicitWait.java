package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandImplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://kwickremoval.co.uk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		
		driver.findElement(By.partialLinkText("Contact us")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'info')]")).getText();
		System.out.println(text);
		driver.quit();
	}

}

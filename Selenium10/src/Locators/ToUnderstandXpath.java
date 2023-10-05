package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandXpath {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com");
			driver.findElement(By.linkText("Jewelry")).click();
			driver.findElement(By.partialLinkText("Black & White Diamond Heart")).click();
			
			
			
			
			
	}

}

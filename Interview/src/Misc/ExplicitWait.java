package Misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		driver.get("https://www.shoppersstack.com/products_page/418");
		driver.findElement(By.id("Check Delivery")).sendKeys("560099");
		WebElement checkbutton = driver.findElement(By.id("Check"));

		WebDriverWait obj=new WebDriverWait(driver, 10);
		obj.until(ExpectedConditions.elementToBeClickable(checkbutton));
		driver.findElement(By.id("Check")).click();
		
		
		

		
	}

}

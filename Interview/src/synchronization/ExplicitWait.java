package synchronization;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/products_page/418");
		WebElement button = driver.findElement(By.id("Check"));
		driver.findElement(By.id("Check Delivery")).sendKeys("560099");
		
		WebDriverWait obj=new WebDriverWait(driver, 50);
		obj.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		String status = driver.findElement(By.id("Check Delivery-helper-text")).getText();
		
		System.out.println(status);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/abc.png");		
		FileHandler.

		
		
		
		
	}

}

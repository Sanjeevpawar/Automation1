package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeMoveToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.meesho.com/");
		
		WebElement home = driver.findElementByXPath("//span[text()='Home & Kitchen']");
		WebElement kitchen = driver.findElement(By.xpath("//p[contains(text(),'Kitchen Storage')]"));
		
		
		Actions obj=new Actions(driver);
		obj.moveToElement(home).click(kitchen).perform();
		
		
	}

}

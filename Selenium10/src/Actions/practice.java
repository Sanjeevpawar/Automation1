package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

		
		
		// click and hold
	/*	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("1231231");
		Actions obj=new Actions(driver);
		obj.moveByOffset(1638,384).clickAndHold().perform();*/
		
		
		// Click and hold(web element)
	/*	driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.id("password")).sendKeys("1231231");
		WebElement Icon = driver.findElement(By.xpath("//div[contains(@class,'shownhide')]"));
		Actions obj=new Actions(driver);
		obj.clickAndHold(Icon).perform(); */
		
		
		// Move To Element(Web Element)
		driver.get("https://www.meesho.com/");
		WebElement kitchen = driver.findElement(By.xpath("//span[contains(text(),'Home & Kitchen')]"));
		Actions obj=new Actions(driver);
		obj.moveToElement(kitchen).perform();
		driver.findElement(By.xpath("//p[contains(text(),'Doormats')]")).click();
		
		// Move to Element(int x, int y)
		obj.moveToElement(kitchen, 813, 203).perform();
		}

}

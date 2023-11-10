package Misc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.meesho.com");
		WebElement MenTab = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
		
		Actions obj=new Actions(driver);
		obj.moveToElement(MenTab).perform();
		driver.findElement(By.xpath("//p[contains(text(),'Tshirts')]")).click();
		
	}

}

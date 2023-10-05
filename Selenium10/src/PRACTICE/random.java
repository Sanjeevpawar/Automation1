package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class random {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement f1 = driver.findElement(By.xpath("//iframe[contains(@class,'demo-frame lazyloaded')]"));
		driver.switchTo().frame(f1);
		
		WebElement src = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement dest = driver.findElement(By.id("trash"));
		Actions a= new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		
}
}
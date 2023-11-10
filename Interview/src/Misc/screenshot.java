package Misc;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class screenshot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement framename = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(framename);
		WebElement pic1 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement dest = driver.findElement(By.id("trash"));
		
			
			WebElement rt = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
			
			Actions obj=new Actions(driver);
			obj.contextClick(rt).perform();
			
			File src = driver.getScreenshotAs(OutputType.FILE);
			File det=new File("./screenshot/dragdrop.png");
			
			FileHandler.
		
	}

}

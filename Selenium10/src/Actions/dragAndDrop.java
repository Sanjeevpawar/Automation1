package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			driver.switchTo().frame(frame1);
			 
			WebElement Tatras2=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			WebElement Tatras3 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
			WebElement Tatras4 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
			WebElement Tatras5 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
			WebElement trash = driver.findElement(By.id("trash"));
			
			Actions obj=new Actions(driver);
			
			obj.dragAndDrop(Tatras2, trash).perform();
			Thread.sleep(3000);
			obj.dragAndDrop(Tatras3, trash).perform();
			Thread.sleep(3000);
			obj.dragAndDrop(Tatras4, trash).perform();
			Thread.sleep(3000);
			obj.dragAndDrop(Tatras5, trash).perform();
			
			// another method
			obj.clickAndHold(Tatras2).release(trash).perform();
			obj.moveToElement(Tatras3).clickAndHold(trash).perform();
			
			
	}
}


package Action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement fram = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(fram);
		
		WebElement pic1 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement pic2 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement pic3 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement pic4 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

		WebElement dest = driver.findElement(By.id("trash"));
		Actions obj=new Actions(driver);
		obj.dragAndDrop(pic1, dest).perform();
		obj.dragAndDrop(pic2, dest).perform();
		obj.dragAndDrop(pic3, dest).perform();
		obj.dragAndDrop(pic4, dest).perform();
		
		
	}

}

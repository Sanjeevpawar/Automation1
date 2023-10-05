package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		Alert pop = driver.switchTo().alert();
		pop.accept();
		
		driver.quit();
	}

}

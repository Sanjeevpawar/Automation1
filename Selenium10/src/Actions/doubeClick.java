package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubeClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
				
		WebElement db1 = driver.findElement(By.id("add"));
		Actions obj=new Actions(driver);
		for(int i=1;i<=2;i++)
		{
		obj.doubleClick(db1).perform();
		}
				
		WebElement db2 = driver.findElement(By.id("minus"));
		for(int i=1;i<=2;i++)
		{
		obj.doubleClick(db2).perform();
		}
		
		
		
	}

}

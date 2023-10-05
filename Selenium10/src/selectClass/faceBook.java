package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class faceBook {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		WebElement daydropdown = driver.findElement(By.id("day"));
		WebElement monthdropdown = driver.findElement(By.id("month"));
		WebElement yeardropdown = driver.findElement(By.id("year"));
		
		
		
		// Check if its multi select drop down
		Select date=new Select(daydropdown); 
		System.out.println(date.isMultiple());
		Thread.sleep(3000);
		
		//Select 10th day by index
		date.selectByIndex(9);
		Thread.sleep(3000);
		
		//Select february month by vale
		Select month=new Select(monthdropdown);
		month.selectByValue("2");
		
		List<WebElement> all = month.getOptions();
		for(WebElement sanj:all)
		{
			System.out.println(sanj.getText());
		}
		Thread.sleep(3000);
		
		//Select 2010 by visible text
		Select year=new Select(yeardropdown);
		year.selectByVisibleText("2010");
		
		
	}

}

package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		WebElement date = driver.findElement(By.id("day"));
		WebElement Month = driver.findElement(By.id("month"));
		WebElement Year = driver.findElement(By.id("year"));
		
		Select obj=new Select(date);
		obj.selectByIndex(2);
		Thread.sleep(4);
		List<WebElement> xyz = obj.getAllSelectedOptions();
		for(WebElement abc: xyz)
		{
			System.out.println(abc.getText());
		}
	
		
		
		
		Select objmonth=new Select(Month);
		objmonth.selectByIndex(4);
		
		Select objyear=new Select(Year);
		objyear.selectByIndex(5);
	}

}

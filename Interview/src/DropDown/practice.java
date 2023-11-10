package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		WebElement date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		Select obj=new Select(date);
		obj.selectByIndex(2);
		List<WebElement> selected = obj.getAllSelectedOptions();
		List<WebElement> alloptions = obj.getOptions();
		
		for(WebElement abc:selected)
		{
			System.out.println(abc.getText());
		}
		
		for(WebElement xyz:alloptions)
		{
			System.out.println(xyz.getText());
		}
		
		Select mon=new Select(month);
		mon.selectByValue("2");
		
		Select yea=new Select(year);
		yea.selectByVisibleText("2000");
		
	}

}

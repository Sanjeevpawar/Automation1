package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://fb.com");
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		WebElement date = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select dat=new Select(date);
		dat.selectByIndex(18);
		List<WebElement> datelist = dat.getOptions();
		for(WebElement abc:datelist)
		{
			System.out.println(abc.getText());
		}
		List<WebElement> selecteddate = dat.getAllSelectedOptions();
		for(WebElement a:selecteddate)
		{
			System.out.println(a.getText());
		}
		
		/*
		 * Select mon=new Select(month); mon.selectByValue("2"); List<WebElement>
		 * monlist = mon.getOptions(); for(WebElement efg:monlist) {
		 * System.out.println(efg.getText()); }
		 * 
		 * Select yea=new Select(year); yea.selectByVisibleText("1986");
		 * 
		 * List<WebElement> yearlist = yea.getOptions(); for(WebElement ijk:yearlist) {
		 * System.out.println(ijk.getText()); }
		 * 
		 */
		
	}

}

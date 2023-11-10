package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCheckIsMultiple {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select obj=new Select(dropdown);
		System.out.println(obj.isMultiple());
		obj.selectByIndex(1);
		obj.selectByVisibleText("Amazon Fashion");
		obj.selectByValue("search-alias=jewelry");
	
	}
	
	

}

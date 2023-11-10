package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleAmazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		
		Select obj=new Select(drop);
		System.out.println(obj.isMultiple());
       
		List<WebElement> alloptions = obj.getOptions();
		
		for(WebElement abc: alloptions)
		{
			System.out.println(abc.getText());
		}
		
	}

}

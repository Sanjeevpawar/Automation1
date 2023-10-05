package PRACTICE;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.out.println(" #######################  Script execution started ####################################");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		WebElement multi = driver.findElement(By.id("cars"));
		Select abc=new Select(multi);
		System.out.println(abc.isMultiple());
		abc.selectByValue("299");
		abc.selectByIndex(1);
		
		abc.selectByVisibleText("INR 300 - INR 399 ( 1 )");
		
		
		
		List<WebElement> all = abc.getAllSelectedOptions();
		for(WebElement printall: all)
		{
			System.out.println(printall.getText());
		}
		System.out.println(abc.getFirstSelectedOption().getText());
		abc.getOptions();
		
		
		
		
		
		
		System.out.println("#################  Script executed successfully    ###########################");
		
		
		
		
		
		
		
		
		
	}

}

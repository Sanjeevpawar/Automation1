package testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithMultiSelectDropdown {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select obj=new Select(dropdown);
		obj.selectByIndex(1);
		obj.selectByValue("299");
		obj.selectByVisibleText("More Than INR 500 ( 55 )");
		
	
		List<WebElement> var = obj.getAllSelectedOptions();
		
		for(WebElement list: var)
		{
			System.out.println(list.getText());
		}

	}

}

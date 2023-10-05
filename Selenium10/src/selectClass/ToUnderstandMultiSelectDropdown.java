package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		WebElement listBox = driver.findElement(By.id("cars"));
		Select selectOption=new Select(listBox);
		
		selectOption.isMultiple();
		
		//Select By Index
		selectOption.selectByIndex(3);
		
		
		// Select by value
		selectOption.selectByValue("90");
		Thread.sleep(3000);
		
		// Select by visible text
		selectOption.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		
		
		// Display all selected options
        List<WebElement> abc = selectOption.getAllSelectedOptions();
		
		for(WebElement xyz:abc)
		{
			System.out.println(xyz.getText());
		}
		
		
		//De-selecting by index
		selectOption.deselectByIndex(3);
		
		//De-selecting by value
		selectOption.deselectByValue("90");
		
		// De-Selecting by visible text
		selectOption.deselectByVisibleText("INR 50 - INR 99 ( 1 )");
		
				
	}

}

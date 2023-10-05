package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticingSelect {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement listbox = driver.findElement(By.id("searchDropdownBox"));
		Select selectOption=new Select(listbox);
		
		selectOption.selectByValue("search-alias=apparel");
		List<WebElement> allOptions = selectOption.getOptions();
		
		for(WebElement printAll:allOptions)
		{
			System.out.println(printAll.getText());
		}
		
	
	}

}

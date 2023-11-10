package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://demoapp.skillrary.com/");
	
	
	
	
	WebElement dropdown = driver.findElementById("cars");
	Select dd= new Select(dropdown);
	
	System.out.println(dd.isMultiple());
	dd.selectByIndex(0);
	dd.selectByValue("99");
	dd.selectByVisibleText("INR 100 - INR 199 ( 16 )");
	
	}
	
}

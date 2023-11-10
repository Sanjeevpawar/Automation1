package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataWithoutSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].value='Automation'", search);
		driver.findElement(By.id("nav-search-submit-button")).click();

	}
	}



package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandScrollIntoView {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.polarbear.co.in");
		
		JavascriptExecutor js=driver;
		WebElement img = driver.findElement(By.xpath("//h2[contains(text(),'120+')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", img);
		
	}

}

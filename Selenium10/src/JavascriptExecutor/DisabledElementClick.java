package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElementClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.levi.in/buy-more-save-more?/");
		WebElement search = driver.findElement(By.xpath("//a[contains(text(),'Yellow Brand Logo Printed Crew')]/../../..//a[@id='quickviewbutton']"));
		
		JavascriptExecutor js=driver;
		js.executeScript("arguments[0].click()", search);
		
}
}
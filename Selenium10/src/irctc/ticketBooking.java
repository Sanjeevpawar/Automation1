package irctc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ticketBooking {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://irctc.co.in");
		driver.findElement(By.partialLinkText("LOGIN")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'User Name')]")).sendKeys("sanjisbad");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("Seltoshtx@123");
		Thread.sleep(10);
		driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
		
		
		
		
		
	}

}

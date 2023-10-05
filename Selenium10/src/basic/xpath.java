package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.wikipedia.com/");
		driver.findElement(By.id("searchInput")).sendKeys("Cricket");
		driver.findElement(By.xpath("//p[contains(text(),'Bat-and-ball game')]")).click();
		String text = driver.findElement(By.xpath("//th[contains(text(),'Venue')]")).getText();
		
		if(text.contains("Cricket field"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Failed"+ text);
		}
	}
	

}

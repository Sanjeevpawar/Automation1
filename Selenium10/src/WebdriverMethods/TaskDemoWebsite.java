package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDemoWebsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/ ");
		driver.manage().window().maximize();
		//driver.findElement(By.id("small-searchterms")).sendKeys("Jewelry",Keys.ENTER);
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		driver.findElement(By.partialLinkText("Black & White Diamond Heart")).click();
		String text = driver.findElement(By.xpath("//div[@class='short-description']")).getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.quit();
				
	}

}

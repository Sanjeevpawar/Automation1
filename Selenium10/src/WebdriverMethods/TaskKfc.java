package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskKfc {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://kwickremoval.co.uk");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Contact us")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.xpath("//span[contains(text(),'info')]")).getText();
		Thread.sleep(3000);
		System.out.println(text);
		driver.quit();
		}

}

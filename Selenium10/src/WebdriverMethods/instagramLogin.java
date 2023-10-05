package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement Login = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		System.out.println(Login.isEnabled());
		driver.findElement(By.xpath("//input[contains(@aria-label,'username')]")).sendKeys("sanjeev");
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("123456");
		Thread.sleep(2000);
		System.out.println(Login.isEnabled());
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
		
	}

}

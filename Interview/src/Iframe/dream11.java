package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://dream11.com/");
			WebElement fr = driver.findElement(By.id("send-sms-iframe"));
			driver.switchTo().frame(fr);
			driver.findElement(By.id("regEmail")).sendKeys("9986445157");
			
			
	}

}

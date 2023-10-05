package naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	driver.findElement(By.id("username")).sendKeys("sanjeevpawar19@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Seltoshtx@123");
	driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	driver.findElement(By.xpath("//img[contains(@alt,'Sanjeev Kumar')]")).click();
	
	
	
	}
	
}

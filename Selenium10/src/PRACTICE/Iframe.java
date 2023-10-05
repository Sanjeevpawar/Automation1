package PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		
		
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.xpath("//img[contains(@alt,'Calabash Mobile App Automation')]")).click();
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Calabash Training')]")).isDisplayed());
		
		
	}

}

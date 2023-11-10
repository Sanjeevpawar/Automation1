package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	//	driver.switchTo().frame("login_page");
		driver.findElement(By.name("fldLoginUserId")).sendKeys("45501737");
		driver.findElement(By.partialLinkText("CONTINUE")).click();
	}

}

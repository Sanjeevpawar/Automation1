package iFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame("singleframe");
		System.out.println(" entered in the frame");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123123");
        Thread.sleep(10000);
		
		driver.switchTo().parentFrame();
				driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
				
		
	}

}

package JavascriptExecutor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToUnderstandScrollTo {

		 public static void main(String[] args) throws InterruptedException 
		 {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions abc=new ChromeOptions();
			abc.addArguments("--disable-notifications");
					
			ChromeDriver driver=new ChromeDriver(abc);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
	
			JavascriptExecutor js=driver;
			driver.get("https://wildcraft.com/");
			//js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
			
			js.executeScript("window.scrollTo(0,900)");
			
		 }

}

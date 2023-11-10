package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enteringTextWithoutSendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		WebElement searchbox = driver.findElementById("twotabsearchtextbox");
		
		JavascriptExecutor js= driver;
		js.executeScript("arguments[0].value='Automation'",searchbox );
		
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,200)");
			
	
				
	

}
}

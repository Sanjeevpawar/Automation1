package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement text = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		Thread.sleep(5000);
		System.out.println(text.getCssValue("color"));
		System.out.println(text.getCssValue("font-size"));
		System.out.println(text.getAttribute("alt"));
		
		driver.findElement(By.id("small-searchterms")).sendKeys("23242", Keys.ENTER);
		
		
	}

}

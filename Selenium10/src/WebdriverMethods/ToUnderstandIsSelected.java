package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandIsSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement radiobutton = driver.findElement(By.id("gender-female"));
		
		//System.out.println(radiobutton.isSelected());
		//radiobutton.click();
		//System.out.println(radiobutton.isSelected());
	
		
	}

}

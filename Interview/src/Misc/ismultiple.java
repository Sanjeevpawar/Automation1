package Misc;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.fb.com");
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		WebElement day = driver.findElement(By.id("day"));
		
		Select obj=new Select(day);
		boolean op = obj.isMultiple();
		
		List<WebElement> getall = obj.getAllSelectedOptions();
		for(WebElement abc:getall)
		{
			System.out.println(abc.getText());
		}
		
		
		
		

}
}
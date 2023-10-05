package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectCake {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.winni.in/");
		WebElement hover = driver.findElement(By.partialLinkText("CAKES"));
		Actions obj=new Actions(driver);
		obj.moveToElement(hover).perform();
		driver.findElement(By.partialLinkText("Chocolate Cakes")).click();
		driver.findElement(By.xpath("//img[contains(@title,'Death By Chocolate Cake')]")).click();
		WebElement confirm = driver.findElement(By.xpath("//h1[contains(text(),'Death By Chocolate Cake')]"));
		if(confirm.isDisplayed()==true)
		{
			System.out.println("Item is clicked and verified");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
	}
	}



package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://amazon.in");
		WebElement listbox = driver.findElement(By.id("searchDropdownBox"));
		Select abc=new Select(listbox);
		boolean c = abc.isMultiple();
		if(c==true)
		{
			System.out.println("Yes. its a multi selecct dropdown");
		}
		else
		{
			System.out.println("Its not a multi select dropdown");
		}
		
		
		abc.selectByVisibleText("Amazon Fresh");
		
		List<WebElement> all = abc.getOptions();
		
		for(WebElement xyz:all)
		{
			System.out.println(xyz.getText());
		}
	}

}

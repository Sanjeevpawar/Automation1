package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://amazon.in");
		WebElement listbox = driver.findElement(By.id("searchDropdownBox"));
		
		Select selectOption=new Select(listbox);
		selectOption.selectByVisibleText("Books");
		Thread.sleep(5);
		
		List<WebElement> all = selectOption.getOptions();
		
		for(WebElement fulllist:all)
		{
			System.out.println(fulllist.getText());
		
		
				
	}

}
}
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11 {

	public static void main(String[] args) {

		//System.setProperty("wedriver.chrome.driver","./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("htttps://dream11.com");
		
		//driver.findElement(By.id("regEmail")).sendKeys("9986592181");
	//	driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile Number')]")).sendKeys("9986592181");
		
	}

}

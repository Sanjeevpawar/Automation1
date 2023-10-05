package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class NexrCo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://next.co.uk");
		driver.manage().window().maximize();
		
	}

}

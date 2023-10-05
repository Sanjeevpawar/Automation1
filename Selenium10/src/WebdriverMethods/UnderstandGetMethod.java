package WebdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandGetMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://restaurants.kfc.co.in/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();		
		Thread.sleep(5000);
		driver.close();
		
	}
}



package screenshots;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class AssignmentWashingtonDragDrop {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement fram = driver.findElement(By.id("mainContainer"));
		
		
		Actions action=new Actions(driver);
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement US = driver.findElement(By.id("box103"));
		
		action.dragAndDrop(washington,US).perform();
		action.contextClick(US).perform();
		Thread.sleep(2000);
		
		
		
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/rightclickUS.png");
		FileHandler.copy(src, dest);
		
		
		
		
		
		
	}

}

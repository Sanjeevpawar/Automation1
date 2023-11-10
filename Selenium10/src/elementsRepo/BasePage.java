package elementsRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


private @FindBy(linkText="Register") WebElement registeLink;
private @FindBy(linkText="Log in") WebElement loginLink;
private @FindBy(linkText="Shopping cart") WebElement shoppongCartLink;
	
	public WebElement getRegisteLink() {
		return registeLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getShoppongCartLink() {
		return shoppongCartLink;
	}
	





}

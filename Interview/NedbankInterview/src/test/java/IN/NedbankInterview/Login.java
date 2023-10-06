package IN.NedbankInterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Login {
	
	
	private WebDriver driver;
	
	//By Locators
	
	
	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://practicetestautomation.com/practice-test-login/");
	   
	}

	@When("user enters the valid email id student")
	public void user_enters_the_valid_email_id_student() {
	
	}

	@When("User enters valid password Password123")
	public void user_enters_valid_password_password123() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Login should be succesfull and home page must be displayed")
	public void login_should_be_succesfull_and_home_page_must_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters the valid email id incorrectUser")
	public void user_enters_the_valid_email_id_incorrect_user() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

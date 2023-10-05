package workingWithTestNG;

import org.testng.annotations.Test;

public class workingWithPriority {


	@Test(priority = 1)
	public void homepage()
	{
		System.out.println("homepage is displayed");
    }

	@Test(priority = 2)
	public void login()
	{
		System.out.println("User is able to login");
	}

	
	@Test(priority = 3)
	public void productcart()
	{
		System.out.println("user is able to add product to the cart");
	}
	
	@Test(priority = 4, dependsOnMethods = "login")
	public void payment()
	{
		System.out.println("user is bale to make payment");
	}
	
	@Test
	public void logout()
	{
		System.out.println("User is able to logout");
	}

	@Test(priority=1,dependsOnMethods = {"login"})
	public void Homepage()
	{
		System.out.println("Homepage is displayed");
	}
	

	
	
	
}

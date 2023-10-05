package workingWithTestNG;

import org.testng.annotations.Test;

public class sample {
	
	
	@Test
	public void homepage()
	{
		System.out.println("homepage is displayed");
    }

	@Test
	public void login()
	{
		System.out.println("User is able to login");
	}

	
	@Test
	public void productcart()
	{
		System.out.println("user is able to add product to the cart");
	}
	
	@Test
	public void payment()
	{
		System.out.println("user is bale to make payment");
	}
	
	@Test
	public void logout()
	{
		System.out.println("User is able to logout");
	}

	@Test
	public void Homepage()
	{
		System.out.println("Homepage is displayed");
	}
	
}


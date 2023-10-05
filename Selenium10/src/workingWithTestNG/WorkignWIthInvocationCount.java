package workingWithTestNG;

import org.testng.annotations.Test;

public class WorkignWIthInvocationCount {


	@Test()
	public void inbox()
	{
		System.out.println("inbox is displayed");
	}
	
	
	
	@Test(invocationCount = 5)
	public void addtocart()
	{
		System.out.println("cart is displayed");
	}
}

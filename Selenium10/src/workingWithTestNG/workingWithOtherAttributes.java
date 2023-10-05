package workingWithTestNG;

import org.testng.annotations.Test;

public class workingWithOtherAttributes {
	
	@Test(enabled = true)
	public void Homepage()
	{
		System.out.println("Homepage is displayed");
	}
	
	@Test(description = "Sample text")
	public void register()
	{
		System.out.println("register is displayed");
	}
	
	@Test()
	public void inbox()
	{
		System.out.println("inbox is displayed");
	}
	
	@Test()
	public void India()
	{
		int a=9/0;
		System.out.println("India is displayed");
	}
	
	@Test(dependsOnMethods = "India", alwaysRun = true)
	public void addtocart()
	{
		System.out.println("cart is displayed");
	}
	
	
}

package practice;

import org.testng.annotations.Test;

public class helloTest {
	@Test(groups = "smoke")
	public void pract()
	{
		System.out.println("hello");
	}

	
	@Test(groups = {"smoke","regression"})
	public void pract2()
	{
		System.out.println("practice makes perfect");
	}
}

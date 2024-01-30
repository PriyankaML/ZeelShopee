package practice;

import org.testng.annotations.Test;

public class jenkinsPipelineTest {

	
	@Test
	public void pipelineTest()
	{
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("env");
		
		System.out.println(BROWSER);
		
		
		System.out.println(ENV);
		
		System.out.println("choosed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

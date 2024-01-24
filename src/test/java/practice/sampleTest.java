package practice;

import org.testng.annotations.Test;

public class sampleTest {
@Test(groups = "smoke")
public void monday()
{
	System.out.println("today is not monday");
}

@Test(groups = {"smoke","regression"})
public void Tuesday()
{
	System.out.println("today is not tuesday");
}

}

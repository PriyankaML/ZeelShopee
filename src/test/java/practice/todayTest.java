package practice;

import org.testng.annotations.Test;

public class todayTest {
@Test(groups = {"smoke","regression"})
public void wednesday()
{
	System.out.println("today is wednesday");

}

@Test(groups = "smoke")
public void Thursday()
{
	System.out.println("today is not thursday");
}
}

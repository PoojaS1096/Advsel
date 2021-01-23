package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2
{
	@Test
	public void test3()
	{
		Reporter.log("3",true);
	}
	@Test
	public void test4()
	{
		Reporter.log("4",true);
	}
}

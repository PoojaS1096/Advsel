package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void test1()
	{
		Reporter.log("WE GOT EXPECTED RESULT",true);
	}
    
	@Test
	public void test2()
	{
		Reporter.log("2",true);
	}
}

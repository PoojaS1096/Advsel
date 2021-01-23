package reports;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extentreport
{
	@Test
	public void case1()
	{
		//created object for extent report
	ExtentReports report=new ExtentReports("./reports/r.html",false);
      ExtentTest test = report.startTest("Tc1");//start the test execution
      test.log(LogStatus.PASS,"pass");//log the status
      test.log(LogStatus.FAIL,"false");
      report.endTest(test);//end test execution
      report.flush();//flush
	}
}

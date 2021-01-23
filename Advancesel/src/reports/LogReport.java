package reports;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;


public class LogReport
{
	@Test
	public void report() throws IOException
	{
		Layout layout=new PatternLayout("%d %c %m %n");
		Appender app=new FileAppender(layout,"./reports/r12.log");
		BasicConfigurator.configure();//configured log4j
		Logger log=Logger.getLogger(this.getClass().getName());
		log.warn("warning");
		log.error("error");
		log.info("info");
	}
}

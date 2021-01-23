package reports;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Extent
{
	@Test
	public void console()
	{
		BasicConfigurator.configure();
		Logger log=Logger.getLogger(this.getClass().getName());
		log.warn("warning");
		log.error("error");
		log.info("info");
	}
}

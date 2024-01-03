package Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class LogsCaptures {
	
	 public static void takelogs(String className,String message)
	 {
		 DOMConfigurator.configure("..//SeleniumLearning/Layout.xml");
		 Logger log=LogManager.getLogger(className);
		  log.info(message);
		 
	 }

}

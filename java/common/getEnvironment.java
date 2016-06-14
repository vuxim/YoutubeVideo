package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class getEnvironment {
	public static void openBrowser() throws Exception {
	    utils.driver = new FirefoxDriver();
	    utils.driver.manage().window().maximize();
	    utils.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	    
	  }
	

}

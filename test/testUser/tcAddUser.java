package testUser;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.getEnvironment;
import common.utils;
import pageObject.ObjectSpeedTest.AddUserPage;
public class tcAddUser {
	@Test
	public static void testAddUser() throws Exception {	

		// Go to the Sign up page
		utils.driver.get(utils.URL +"/user/signup.php"); 		
		// Enter the first name		
		utils.driver.findElement(AddUserPage.txtFirstName).sendKeys("Hoang");
		// Enter the last name
		utils.driver.findElement(AddUserPage.txtLastName).sendKeys("Mai");
		// Enter Email
		utils.driver.findElement(AddUserPage.txtEmail).sendKeys("vuhoangmai91@gmail.com");
		// Enter Password
		utils.driver.findElement(AddUserPage.txtPassword).sendKeys("123456789");
		// Enter Confirm Password
		utils.driver.findElement(AddUserPage.txtComFirmPassword).sendKeys("123456789");
		// Enter Company Name
		utils.driver.findElement(AddUserPage.txtCompanyName).sendKeys("Testing");
		// Enter Company site
		utils.driver.findElement(AddUserPage.txtCompanySite).sendKeys("http://google.com");
		// Enter Installation URL
		utils.driver.findElement(AddUserPage.txtInstallationUrl).sendKeys("http://google.com");
		// Submit
		Thread.sleep(3000);
		// I don't want to submit :)
		// utils.driver.findElement(AddUserPage.btnSubmit).click();
	}
	
	
	@BeforeTest
	public void beforeTest() throws Exception {
		getEnvironment.openBrowser();
	}

	@AfterTest
	public void afterTest() throws Exception {				
		utils.driver.quit();
	}

}

package pageObject;

import org.openqa.selenium.By;

public class ObjectSpeedTest {
	public static class AddUserPage {
		// First Name Field
		public static By txtFirstName = By.id("first_name");
		// Last Name Field
		public static By txtLastName = By.id("last_name");
		// Email Field
		public static By txtEmail = By.id("email");	
		// Password Field
		public static By txtPassword = By.id("password");	
		// Confirm Field
		public static By txtComFirmPassword = By.id("confirm_password");	
		// Company Name Field
		public static By txtCompanyName = By.id("companyname");
		// Company Website Field
		public static By txtCompanySite = By.id("companywebsite");
		// Company Installation URL Field
		public static By txtInstallationUrl = By.id("installationurl");
		// Button Submit
		public static By btnSubmit = By.xpath("//input[@value='Register!']");
	}	
	
	public static class LoginPage {
		// Enter User
		public static By txtUsername = By.id("first_name");
		// Enter Password
		public static By txtPassword = By.xpath("//input[@name='password']");
		// Button Submit
		public static By btnSubmit = By.xpath("//input[@value='Login!']");

	}
}
	
	



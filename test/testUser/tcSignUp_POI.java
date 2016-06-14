package testUser;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.ExcelCommon;
import common.getEnvironment;
import common.utils;
import pageObject.ObjectSpeedTest.AddUserPage;


public class tcSignUp_POI {
	@Test
	public static void testLogin() throws Exception {
		// Go to the Sign up page
		utils.driver.get(utils.URL +"/user/signup.php"); 		
		// Get data from Excel				
		XSSFSheet ExcelWSheet = ExcelCommon.setExcelFile("POI_TestDataSignUp.xlsx", "Sheet1");				
		String FirstName = ExcelCommon.getCellData(1, 1, ExcelWSheet);
		String LastName = ExcelCommon.getCellData(1, 2, ExcelWSheet);	
		String email = ExcelCommon.getCellData(1, 3, ExcelWSheet);
		String Password = ExcelCommon.getCellData(1, 4, ExcelWSheet);
		String ComFirmPassword = ExcelCommon.getCellData(1, 5, ExcelWSheet);
		String CompanyName = ExcelCommon.getCellData(1, 6, ExcelWSheet);
		String CompanySite = ExcelCommon.getCellData(1, 7, ExcelWSheet);
		String URL = ExcelCommon.getCellData(1, 8, ExcelWSheet);
		// Enter username and password
		utils.driver.findElement(AddUserPage.txtFirstName).clear();
		utils.driver.findElement(AddUserPage.txtFirstName).sendKeys(FirstName);
		utils.driver.findElement(AddUserPage.txtLastName).clear();
		utils.driver.findElement(AddUserPage.txtLastName).sendKeys(LastName);
		utils.driver.findElement(AddUserPage.txtEmail).clear();
		utils.driver.findElement(AddUserPage.txtEmail).sendKeys(email);
		utils.driver.findElement(AddUserPage.txtPassword).clear();
		utils.driver.findElement(AddUserPage.txtPassword).sendKeys(Password);
		
		utils.driver.findElement(AddUserPage.txtComFirmPassword).clear();
		utils.driver.findElement(AddUserPage.txtComFirmPassword).sendKeys(ComFirmPassword);
		
		utils.driver.findElement(AddUserPage.txtCompanyName).clear();
		utils.driver.findElement(AddUserPage.txtCompanyName).sendKeys(CompanyName);
		
		utils.driver.findElement(AddUserPage.txtCompanySite).clear();
		utils.driver.findElement(AddUserPage.txtCompanySite).sendKeys(CompanySite);
		
		utils.driver.findElement(AddUserPage.txtInstallationUrl).clear();
		utils.driver.findElement(AddUserPage.txtInstallationUrl).sendKeys(URL);
		utils.driver.findElement(AddUserPage.btnSubmit).click();
		
		
		
		Thread.sleep(3000);		
		//Verify Admin Page
		String actualTitle = utils.driver.getTitle();
		
		if (actualTitle.contentEquals(utils.EXPECT_TITLE)){
	  		 ExcelCommon.setCellData("Pass", 1, 9, ExcelWSheet);
	
	  	  }else {
	  		ExcelCommon.setCellData("Fail", 1, 9, ExcelWSheet);
	  	  }
	  	 
		 }
		
		
		
	
        
	@BeforeTest
	public void beforeTest() throws Exception {
		getEnvironment.openBrowser();
	}

	@AfterTest
	public void afterTest() throws Exception {				
		// utils.driver.quit();
	}


}

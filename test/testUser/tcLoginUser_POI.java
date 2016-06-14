package testUser;

import static org.testng.AssertJUnit.assertEquals;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.ExcelCommon;
import common.getEnvironment;
import common.utils;

import pageObject.ObjectSpeedTest.LoginPage;

public class tcLoginUser_POI {
	@Test
	public static void testLogin() throws Exception {
		// Go to the Sign up page
		utils.driver.get(utils.URL +"/user/login.php"); 		
		// Get data from Excel				
		XSSFSheet ExcelWSheet = ExcelCommon.setExcelFile("POI_TestData.xlsx", "Sheet1");				
		String Email = ExcelCommon.getCellData(1, 1, ExcelWSheet);
		String Password = ExcelCommon.getCellData(1, 2, ExcelWSheet);		
		// Enter username and password
		utils.driver.findElement(LoginPage.txtUsername).clear();
		utils.driver.findElement(LoginPage.txtUsername).sendKeys(Email);
		utils.driver.findElement(LoginPage.txtPassword).clear();
		utils.driver.findElement(LoginPage.txtPassword).sendKeys(Password);
		utils.driver.findElement(LoginPage.btnSubmit).click();	
		
		Thread.sleep(3000);		
		//Verify Admin Page
		String actualTitle = utils.driver.getTitle();
		
		if (actualTitle.contentEquals(utils.EXPECT_TITLE)){
	  		  
	  		  System.out.println("Tittle Passed!");  
	  	  }else {
	  		  System.out.println("Title Failed!");
	  	  }
	  	  assertEquals(utils.EXPECT_TITLE, actualTitle);
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

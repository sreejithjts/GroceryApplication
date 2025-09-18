package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNgBase;
import constants.Constants;
import constants.Messages;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNgBase {
	HomePage homepage;
	AdminPage adminpage;
	@Test(description = "Verify Add New Users in the Admin")
	public void verifyAddUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0,Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1,Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
		homepage=loginpage.clickOnSignIn();
		adminpage=homepage.clickAdminMoreInfo();
		
		FakerUtility fakerUtility = new FakerUtility();
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		String userType=ExcelUtility.getStringData(1, 2,Constants.HOMESHEET);
		adminpage.clickNewButton().enterUsername(randomname).enterPassword(randompassword).enterUserType(userType).clickSave();
		boolean isAlertDisplayed = adminpage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed,Messages.ADDUSERADMINERROR);
	}

}

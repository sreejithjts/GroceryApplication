package testscript;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestNgBase;
import constants.Constants;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNgBase{
HomePage homepage;
@Test(description = "Verify User is able to Logout")
public void verifyLogout() throws IOException {
	//verifyLoginWithValidCredentials
	String usernameValue=ExcelUtility.getStringData(1, 0,Constants.LOGINSHEET);
	String passwordValue=ExcelUtility.getStringData(1, 1,Constants.LOGINSHEET);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernameValue).enterPassword(passwordValue);
	homepage=loginpage.clickOnSignIn();
	homepage.clickAdminIcon();
	loginpage=homepage.clickLogoutButton();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	Assert.assertEquals(actual,expected,Messages.LOGOUTERROR);
}
}

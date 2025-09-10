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
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends TestNgBase {
@Test(priority = 1,description = "Login with valid credentials")
public void verifyLoginWithValidCredentials() throws IOException{
	String usernameValue=ExcelUtility.getStringData(1, 0, Constants.LOGINSHEET);
	String passwordValue=ExcelUtility.getStringData(1, 1, Constants.LOGINSHEET);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernameValue);
	loginpage.enterPassword(passwordValue);
	loginpage.clickOnSignIn();	
	
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin";
	Assert.assertEquals(actual,expected,Messages.VALIDCREDENTIALSERROR);
}
@Test(priority = 2,description = "Login with Invalid Username")
public void verifyLoginWithInvalidUsername() throws IOException {
	String usernameValue=ExcelUtility.getStringData(3, 0,Constants.LOGINSHEET);
	String passwordValue=ExcelUtility.getStringData(3, 1,Constants.LOGINSHEET);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernameValue);
	loginpage.enterPassword(passwordValue);
	loginpage.clickOnSignIn();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	Assert.assertEquals(actual,expected,Messages.INVALIDUSERNAMEERROR);
}
@Test(priority = 3,description="Login with Invalid Password")
public void verifyLoginWithInvalidPassword() throws IOException {
	String usernameValue=ExcelUtility.getStringData(2, 0,Constants.LOGINSHEET);
	String passwordValue=ExcelUtility.getStringData(2, 1,Constants.LOGINSHEET);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernameValue);
	loginpage.enterPassword(passwordValue);
	loginpage.clickOnSignIn();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	Assert.assertEquals(actual,expected,Messages.INVALIDPASSWORDERROR);
	
}
@Test(priority = 4,description="Login with Invalid Username and Invalid Password")
public void verifyLoginWithInvalidUsernameInvalidPassword() throws IOException {
	String usernameValue=ExcelUtility.getStringData(4, 0,Constants.LOGINSHEET);
	String passwordValue=ExcelUtility.getStringData(4, 1,Constants.LOGINSHEET);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernameValue);
	loginpage.enterPassword(passwordValue);
	loginpage.clickOnSignIn();
	String actual = driver.getCurrentUrl();
	String expected = "https://groceryapp.uniqassosiates.com/admin/login";
	Assert.assertEquals(actual,expected,Messages.INVALIDUSERNAMEANDPPASSWORDERROR);
}
}


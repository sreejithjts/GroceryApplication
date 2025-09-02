package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNgBase;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends TestNgBase{
@Test
public void verifyLogout() throws IOException {
	//verifyLoginWithValidCredentials
	String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
	String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernameValue);
	loginpage.enterPassword(passwordValue);
	loginpage.clickOnSignIn();
	HomePage homepage = new HomePage(driver);
	homepage.clickAdminIcon();
	homepage.clickLogoutButton();
}
}

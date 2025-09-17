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
		//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		//username.sendKeys(usernameValue);
		//WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		//password.sendKeys(passwordValue);
		homepage=loginpage.clickOnSignIn();
		adminpage=homepage.clickAdminMoreInfo();
		//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		//login.click();
		
		//AdminPage adminpage = new AdminPage(driver);
		//adminpage.clickAdminMoreInfo();
		
		FakerUtility fakerUtility = new FakerUtility();
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		String userType=ExcelUtility.getStringData(1, 2,Constants.HOMESHEET);
		adminpage.clickNewButton().enterUsername(randomname).enterPassword(randompassword).enterUserType(userType).clickSave();
		//adminpage.enterUsername(randomname);
		//adminpage.enterPassword(randompassword);
		//adminpage.enterUserType(userType);
		//adminpage.clickSave();
		boolean isAlertDisplayed = adminpage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed,Messages.ADDUSERADMINERROR);
	}

}

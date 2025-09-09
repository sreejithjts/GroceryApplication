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
import pages.AdminPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNgBase {
	@Test(description = "Verify Add New Users in the Admin")
	public void verifyAddUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0,Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(1, 1,Constants.LOGINSHEET);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		
		AdminPage adminpage = new AdminPage(driver);
		adminpage.clickAdminMoreInfo();
		
		FakerUtility fakerUtility = new FakerUtility();
		String randomname=fakerUtility.createRandomUserName();
		String randompassword=fakerUtility.createRandomPassword();
		String userType=ExcelUtility.getStringData(1, 2,Constants.HOMESHEET);
		adminpage.clickNewButton();
		adminpage.enterUsername(randomname);
		adminpage.enterPassword(randompassword);
		adminpage.enterUserType(userType);
		adminpage.clickSave();
		boolean isAlertDisplayed = adminpage.isAlertDisplayed();
		Assert.assertTrue(isAlertDisplayed,"User is not added successfully");
	}

}

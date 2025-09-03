package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestNgBase;
import pages.AdminPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminTest extends TestNgBase {
	@Test
	public void verifyAddUser() throws IOException {
		String usernameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
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
		String userType=ExcelUtility.getStringData(1, 2,"HomePage");
		adminpage.clickNewButton();
		adminpage.enterUsername(randomname);
		adminpage.enterPassword(randompassword);
		adminpage.enterUserType(userType);
		adminpage.clickSave();
		
	}

}

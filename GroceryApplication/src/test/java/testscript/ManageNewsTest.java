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
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNgBase{
	@Test(description = "Verify User is able to Add News")
	public void verifyAddNews() throws IOException {
	
	String usernameValue=ExcelUtility.getStringData(6, 0,Constants.LOGINSHEET);
	String passwordValue=ExcelUtility.getStringData(6, 1,Constants.LOGINSHEET);
	LoginPage loginpage = new LoginPage(driver);
	loginpage.enterUserName(usernameValue);
	loginpage.enterPassword(passwordValue);
	loginpage.clickOnSignIn();
	//Testcases to navigate Manage News 
	ManageNewsPage managenewspage = new ManageNewsPage(driver);
	managenewspage.manageNewsTitle();
	managenewspage.clickNewsButton();
	//testcases to click on newbutton and related actions
	managenewspage.enterNewsTextbox();
	managenewspage.clickSaveButton();
	boolean isAlertDisplayed = managenewspage.isAlertDisplayed();
	Assert.assertTrue(isAlertDisplayed,Messages.ADDNEWSERROR);
}
	@Test(description = "Verify User is able to Return to Home Page")
	public void verifyReturnToHome() throws IOException {

		String usernameValue=ExcelUtility.getStringData(6, 0,Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(6, 1,Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
		//Testcases to navigate Manage News 
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.manageNewsTitle();
		managenewspage.clickHome();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/home";
		Assert.assertEquals(actual,expected,Messages.RETURNTOHOMEERROR);
		
	}
	@Test(description = "Verify User is able to Search News")
	public void verifySearchNews() throws IOException {
		String usernameValue=ExcelUtility.getStringData(6, 0,Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(6, 1,Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
		//Testcases to navigate Manage News 
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.manageNewsTitle();
		managenewspage.clickSearch();
		managenewspage.sendTitle();
		managenewspage.searchButtonClick();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/news/index";
		Assert.assertEquals(actual,expected,Messages.SEARCHNEWSERROR);
	}
	@Test(description = "Verify User is able to Reset")
	public void verifyReset() throws IOException {
		String usernameValue=ExcelUtility.getStringData(6, 0,Constants.LOGINSHEET);
		String passwordValue=ExcelUtility.getStringData(6, 1,Constants.LOGINSHEET);
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
		//Testcases to navigate Manage News 
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.manageNewsTitle();
		managenewspage.clickSearch();
		managenewspage.searchResetClick();
		String actual = driver.getCurrentUrl();
		String expected = "https://groceryapp.uniqassosiates.com/admin/list-news";
		Assert.assertEquals(actual,expected,Messages.RESETERROR);
		
	}
}

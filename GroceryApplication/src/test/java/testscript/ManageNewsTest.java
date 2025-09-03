package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNgBase;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNgBase{
	@Test
	public void verifyAddNews() throws IOException {
	
	String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
	String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
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
}
	@Test
	public void verifyReturnToHome() throws IOException {

		String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
		//Testcases to navigate Manage News 
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.manageNewsTitle();
		managenewspage.clickHome();
		
	}
	@Test
	public void verifySearchNews() throws IOException {
		String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
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
	}
	@Test
	public void verifyReset() throws IOException {
		String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserName(usernameValue);
		loginpage.enterPassword(passwordValue);
		loginpage.clickOnSignIn();
		//Testcases to navigate Manage News 
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.manageNewsTitle();
		managenewspage.clickSearch();
		managenewspage.searchResetClick();
	}
}

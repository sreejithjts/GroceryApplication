package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class LoginPage {
	public WebDriver driver;
	PageUtility pageUtility = new PageUtility();
	WaitUtility waitUtility = new WaitUtility();
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='username']")WebElement username;
	public LoginPage enterUserName(String usernameValue) {
		//username.sendKeys(usernameValue);
		pageUtility.sendDataToElement(username, usernameValue);
		return this;
	}
	@FindBy(xpath = "//input[@name='password']")WebElement password;
	public LoginPage enterPassword(String passwordValue) {
		//password.sendKeys(passwordValue);
		pageUtility.sendDataToElement(password, passwordValue);
		return this;
	}
	@FindBy(xpath = "//button[@type='submit']")WebElement login;
	public HomePage clickOnSignIn() {
		//login.click();
		waitUtility.waitUntilClickable(driver, login);
		pageUtility.clickElement(login);
		return new HomePage(driver);
	}
}

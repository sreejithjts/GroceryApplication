package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage {
	public WebDriver driver;
	PageUtility pageUtility = new PageUtility();
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@name='username']")WebElement username;
	public void enterUserName(String usernameValue) {
		//username.sendKeys(usernameValue);
		pageUtility.sendDataToElement(username, usernameValue);
	}
	@FindBy(xpath = "//input[@name='password']")WebElement password;
	public void enterPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}
	@FindBy(xpath = "//button[@type='submit']")WebElement login;
	public void clickOnSignIn() {
		//login.click();
		pageUtility.clickElement(login);
	}
}

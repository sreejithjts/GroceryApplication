package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class ManageNewsPage {
	public WebDriver driver;
	PageUtility pageUtility = new PageUtility();
	WaitUtility waitUtility = new WaitUtility();
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']")WebElement managenewstile;
	public ManageNewsPage manageNewsTitle() {
		waitUtility.waitUntilClickable(driver, managenewstile);
		pageUtility.clickElement(managenewstile);
		return this;
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newsbutton;
	public ManageNewsPage clickNewsButton() {
		waitUtility.waitUntilClickable(driver, newsbutton);
		pageUtility.clickElement(newsbutton);
		return this;
	}
	@FindBy(xpath="//textarea[@id='news']")WebElement newstextbox;
	public ManageNewsPage enterNewsTextbox() {
		pageUtility.sendDataToElement(newstextbox,"Sample News");
		return this;
	}
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	public ManageNewsPage clickSaveButton() {
		waitUtility.waitUntilClickable(driver, savebutton);
		pageUtility.clickElement(savebutton);
		return this;
	}
	@FindBy(xpath="//a[text()='Home']")WebElement home;
	public HomePage clickHome() {
		waitUtility.waitUntilClickable(driver, home);
		pageUtility.clickElement(home);
		return new HomePage(driver);
		
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
	public ManageNewsPage clickSearch() {
		waitUtility.waitUntilClickable(driver, search);
		pageUtility.clickElement(search);
		return this;
	}
	@FindBy(xpath="//input[@placeholder='Title']")WebElement title;
	public ManageNewsPage sendTitle() {
		pageUtility.sendDataToElement(title, "Sample News");
		return this;
	}
	@FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
	public ManageNewsPage searchButtonClick() {
		waitUtility.waitUntilClickable(driver, searchbutton);
		pageUtility.clickElement(searchbutton);
		return this;
	}
	@FindBy(xpath="//a[text()='Reset']")WebElement retest;
	public ManageNewsPage searchResetClick() {
		waitUtility.waitUntilClickable(driver, retest);
		pageUtility.clickElement(retest);
		return this;
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();	
	}
}

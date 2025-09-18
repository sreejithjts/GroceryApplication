package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageNewsPage {
	public WebDriver driver;
	PageUtility pageUtility = new PageUtility();
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']")WebElement managenewstile;
	public ManageNewsPage manageNewsTitle() {
		//managenewstile.click();
		pageUtility.clickElement(managenewstile);
		return this;
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newsbutton;
	public ManageNewsPage clickNewsButton() {
		//newsbutton.click();
		pageUtility.clickElement(newsbutton);
		return this;
	}
	@FindBy(xpath="//textarea[@id='news']")WebElement newstextbox;
	public ManageNewsPage enterNewsTextbox() {
		//newstextbox.sendKeys("Sample News");
		pageUtility.sendDataToElement(newstextbox,"Sample News");
		return this;
	}
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	public ManageNewsPage clickSaveButton() {
		//savebutton.click();
		pageUtility.clickElement(savebutton);
		return this;
	}
	@FindBy(xpath="//a[text()='Home']")WebElement home;
	public HomePage clickHome() {
		//home.click();
		pageUtility.clickElement(home);
		return new HomePage(driver);
		
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
	public ManageNewsPage clickSearch() {
		//search.click();
		pageUtility.clickElement(search);
		return this;
	}
	@FindBy(xpath="//input[@placeholder='Title']")WebElement title;
	public ManageNewsPage sendTitle() {
		//title.sendKeys("Sample News");
		pageUtility.sendDataToElement(title, "Sample News");
		return this;
	}
	@FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
	public ManageNewsPage searchButtonClick() {
		//searchbutton.click();
		pageUtility.clickElement(searchbutton);
		return this;
	}
	@FindBy(xpath="//a[text()='Reset']")WebElement retest;
	public ManageNewsPage searchResetClick() {
		//retest.click();
		pageUtility.clickElement(retest);
		return this;
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();	
	}
}

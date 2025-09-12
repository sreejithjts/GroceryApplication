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
	public void manageNewsTitle() {
		//managenewstile.click();
		pageUtility.clickElement(managenewstile);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newsbutton;
	public void clickNewsButton() {
		//newsbutton.click();
		pageUtility.clickElement(newsbutton);
	}
	@FindBy(xpath="//textarea[@id='news']")WebElement newstextbox;
	public void enterNewsTextbox() {
		//newstextbox.sendKeys("Sample News");
		pageUtility.sendDataToElement(newstextbox,"Sample News");
	}
	@FindBy(xpath="//button[@type='submit']")WebElement savebutton;
	public void clickSaveButton() {
		//savebutton.click();
		pageUtility.clickElement(savebutton);
	}
	@FindBy(xpath="//a[text()='Home']")WebElement home;
	public void clickHome() {
		//home.click();
		pageUtility.clickElement(home);
		
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")WebElement search;
	public void clickSearch() {
		//search.click();
		pageUtility.clickElement(search);
	}
	@FindBy(xpath="//input[@placeholder='Title']")WebElement title;
	public void sendTitle() {
		//title.sendKeys("Sample News");
		pageUtility.sendDataToElement(title, "Sample News");
	}
	@FindBy(xpath="//button[@name='Search']")WebElement searchbutton;
	public void searchButtonClick() {
		//searchbutton.click();
		pageUtility.clickElement(searchbutton);
	}
	@FindBy(xpath="//a[text()='Reset']")WebElement retest;
	public void searchResetClick() {
		//retest.click();
		pageUtility.clickElement(retest);
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	public boolean isAlertDisplayed() {
		return alert.isDisplayed();	
	}
}

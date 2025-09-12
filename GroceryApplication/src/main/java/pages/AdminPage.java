package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminPage {
	public WebDriver driver;
	PageUtility pageUtility = new PageUtility();
	public AdminPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminMoreInfo;
	public void clickAdminMoreInfo() {
		//adminMoreInfo.click();
		pageUtility.clickElement(adminMoreInfo);
	}
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	public void clickNewButton()
	{
		//newbutton.click();
		pageUtility.clickElement(newbutton);
	}
	@FindBy(xpath="//input[@id='username']")WebElement usernamefield;
	public void enterUsername(String randomname)
	{
		//usernamefield.sendKeys(randomname);
		pageUtility.sendDataToElement(usernamefield, randomname);
	}
	@FindBy(xpath="//input[@id='password']")WebElement passwordfield;
	public void enterPassword(String randompassword)
	{
		//passwordfield.sendKeys(randompassword);
		pageUtility.sendDataToElement(passwordfield, randompassword);
	}
	@FindBy(xpath="//select[@id='user_type']")WebElement userTypefield;
	public void enterUserType(String userType)
	{
		//Select select = new Select(userTypefield);
		//select.selectByVisibleText(userType);
		pageUtility.selectDataWithVisibleText(userTypefield, userType);
	}
	@FindBy(xpath="//button[@type='submit' and @name = 'Create']")WebElement saveButton;
	public void clickSave() {
		
		//saveButton.click();
		pageUtility.clickElement(saveButton);
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement addUserAlert;
	public boolean isAlertDisplayed() {
		
			return addUserAlert.isDisplayed();
		}
		
		}
	


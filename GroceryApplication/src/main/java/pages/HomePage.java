package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class HomePage {

	public WebDriver driver;
	PageUtility pageUtility = new PageUtility();
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']")WebElement adminicon;
	public HomePage clickAdminIcon()
	{
	//adminicon.click();
	pageUtility.clickElement(adminicon);
	return this;
	}
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	public LoginPage clickLogoutButton()
	{
	//logout.click();
	pageUtility.clickElement(logout);
	return new LoginPage(driver);
	}
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminMoreInfo;
	public AdminPage clickAdminMoreInfo() {
		//adminMoreInfo.click();
	pageUtility.clickElement(adminMoreInfo);
	return new AdminPage(driver);
	}
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']")WebElement managenewstile;
	public ManageNewsPage clickManageNewsTile() {
		pageUtility.clickElement(managenewstile);
		return new ManageNewsPage(driver) ;
   }
	}
	


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
	public void clickAdminIcon()
	{
	//adminicon.click();
	pageUtility.clickElement(adminicon);
	}
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	public void clickLogoutButton()
	{
	//logout.click();
	pageUtility.clickElement(logout);
	}
	
	
}

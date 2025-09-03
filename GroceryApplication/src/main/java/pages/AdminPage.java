package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdminPage {
	public WebDriver driver;
	public AdminPage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickAdminMoreInfo() {
		WebElement adminMoreInfo = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']"));
		adminMoreInfo.click();
	}
	public void clickNewButton()
	{
		WebElement newbutton=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		newbutton.click();
	}
	public void enterUsername(String randomname)
	{
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id='username']"));
		usernamefield.sendKeys(randomname);
	}
	public void enterPassword(String randompassword)
	{
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id='password']"));
		passwordfield.sendKeys(randompassword);
	}
	public void enterUserType(String userType)
	{
		WebElement userTypefield=driver.findElement(By.xpath("//select[@id='user_type']"));
		Select select = new Select(userTypefield);
		select.selectByVisibleText(userType);
	}
	public void clickSave() {
		WebElement saveButton = driver.findElement(By.xpath("//button[@type='submit' and @name = 'Create']"));
		saveButton.click();
	}
}

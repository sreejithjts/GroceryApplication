package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickAdminIcon()
	{
	WebElement adminicon=driver.findElement(By.xpath("//img[@src='https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png']"));
	adminicon.click();
	}
	public void clickLogoutButton()
	{

	WebElement logout=driver.findElement(By.xpath("//i[@class='ace-icon fa fa-power-off']"));
	logout.click();
	}
}

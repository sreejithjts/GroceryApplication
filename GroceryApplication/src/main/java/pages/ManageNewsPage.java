package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManageNewsPage {
	public WebDriver driver;
	public ManageNewsPage(WebDriver driver) {
		this.driver=driver;
	}
	public void manageNewsTitle() {
		WebElement managenewstile=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstile.click();
	}
	public void clickNewsButton() {
		WebElement newsbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		newsbutton.click();
	}
	public void enterNewsTextbox() {
		WebElement newstextbox = driver.findElement(By.xpath("//textarea[@id='news']"));
		newstextbox.sendKeys("Sample News");
	}
	public void clickSaveButton() {
		WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit']"));
		savebutton.click();
	}
	public void clickHome() {
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
	}
	public void clickSearch() {
		WebElement search=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		search.click();
	}
	public void sendTitle() {
		WebElement title=driver.findElement(By.xpath("//input[@placeholder='Title']"));
		title.sendKeys("Sample News");
	}
	public void searchButtonClick() {
		WebElement title=driver.findElement(By.xpath("//input[@placeholder='Title']"));
		title.sendKeys("Sample News");
	}
	public void searchResetClick() {
		WebElement retest=driver.findElement(By.xpath("//a[text()='Reset']"));
		retest.click();
	}
}

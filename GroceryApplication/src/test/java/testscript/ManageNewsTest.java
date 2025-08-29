package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestNgBase;
import utilities.ExcelUtility;

public class ManageNewsTest extends TestNgBase{
	@Test
	public void verifyAddNews() throws IOException {
	
	String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
	String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
	WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys(usernameValue);
	WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
	password.sendKeys(passwordValue);
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	//Testcases to navigate Manage News 
	WebElement managenewstile=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
	managenewstile.click();
	WebElement newsbutton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
	newsbutton.click();
	//testcases to click on newbutton and related actions
	WebElement newstextbox = driver.findElement(By.xpath("//textarea[@id='news']"));
	newstextbox.sendKeys("Sample News");
	WebElement savebutton = driver.findElement(By.xpath("//button[@type='submit']"));
	savebutton.click();
}
	@Test
	public void verifyReturnToHome() throws IOException {

		String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement managenewstile=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstile.click();
		WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
		
	}
	@Test
	public void verifySearchNews() throws IOException {
		String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement managenewstile=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstile.click();
		WebElement search=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		search.click();
		WebElement title=driver.findElement(By.xpath("//input[@placeholder='Title']"));
		title.sendKeys("Sample News");
		WebElement searchbutton=driver.findElement(By.xpath("//button[@name='Search']"));
		searchbutton.click();
	}
	@Test
	public void verifyReset() throws IOException {
		String usernameValue=ExcelUtility.getStringData(6, 0, "LoginPage");
		String passwordValue=ExcelUtility.getStringData(6, 1, "LoginPage");
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(usernameValue);
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passwordValue);
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		WebElement managenewstile=driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and @class='small-box-footer']"));
		managenewstile.click();
		WebElement search=driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-primary']"));
		search.click();
		WebElement retest=driver.findElement(By.xpath("//a[text()='Reset']"));
		retest.click();
	}
}

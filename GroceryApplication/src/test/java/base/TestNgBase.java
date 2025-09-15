package base;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import utilities.ScreenshotUtility;
import org.testng.annotations.Parameters;

public class TestNgBase  {
public WebDriver driver;
@BeforeMethod(alwaysRun = true)
@Parameters("browser")
public void browserInitializer(String browser) throws Exception {
	//ChromeOptions` allows you to customize how Chrome starts — such as setting preferences, enabling headless mode, disabling extensions, etc.
	if(browser.equalsIgnoreCase("Chrome")) {
		//driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		Map<String,Object> prefs=new HashMap<>();
		prefs.put("profile.password_manager_leak_detection", false);
		options.setExperimentalOption("prefs", prefs);
		driver=new ChromeDriver(options);
	}
	else if(browser.equalsIgnoreCase("Firefox")) {
		driver=new FirefoxDriver();
	}
else {
		throw new Exception("Invalid browser name");
	}

	
	driver.get("https://groceryapp.uniqassosiates.com/admin/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
@AfterMethod
public void quitAndClose() {
	//driver.close();
	//driver.quit();
}
@AfterMethod(alwaysRun = true)//always run after each testcase is executed to ensure that the method following is executed before testcase is terminated 
public void driverQuit(ITestResult iTestResult) throws IOException//interface provided by testNg
{
	if(iTestResult.getStatus()==ITestResult.FAILURE)
	{
		ScreenshotUtility screenShot=new ScreenshotUtility();
		screenShot.getScreenshot(driver, iTestResult.getName());
	}
	driver.quit();

}

}


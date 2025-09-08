package utilities;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenshotUtility {
	public void getScreenshot(WebDriver driver,String failedTestCase) throws IOException
	{
	TakesScreenshot scrShot = (TakesScreenshot) driver;//Takescreenshot Type casting
	File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//To save the screen shot

	String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//format of time stamp
	File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");//create file in  directory
	if (!f1.exists()) {//id output screenshot is not existing create a folder
	f1.mkdirs();//mkdirs is used for create folder
	}
	String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
	+ ".png";
	File finalDestination = new File(destination);
	FileHandler.copy(screenShot, finalDestination);
	}

}

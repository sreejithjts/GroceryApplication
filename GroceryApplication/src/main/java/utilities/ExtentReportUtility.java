package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static final ExtentReports extentReports = new ExtentReports();//static instance of extentreports that can be shared accross the application

	public synchronized static ExtentReports createExtentReports() {
		//Creates an instance of the reporter that will generate the HTML report in the path "./extent-reports/extent-report.html".
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("7R Mart SuperMarket");
		extentReports.attachReporter(reporter);//for attaching the folder creation and report name to the extend report class
		extentReports.setSystemInfo("Organization", "Obsqura");
		extentReports.setSystemInfo("Name", "Sreejith"); //provides context of the report
		return extentReports;
	}
}

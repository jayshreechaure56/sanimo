package listenersUtility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseClassUtility.BaseClass;
import genericUtility.JavaUtility;

public class ListenersWithExtentReportClass implements ISuiteListener, ITestListener {
	public ExtentReports report;
	public ExtentTest test;

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("Report Configuration", true);
		JavaUtility jutil = new JavaUtility();
		String currentTime = jutil.getSystemDateAndTimeForScreenshot();
//************************************************//Extent Report
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/Report_" + currentTime + ".html");
		spark.config().setDocumentTitle("Ninza_CRM");
		spark.config().setReportName("NinzaCRM Report");
		spark.config().setTheme(Theme.DARK);
//************************************************
		report = new ExtentReports();
		report.attachReporter(spark);
		report.setSystemInfo("OS", "Windows11");
		report.setSystemInfo("Browser", "Firefox");
	}

	@Override
	public void onTestStart(ITestResult result) {
//every @Test annotated method
		String methodName = result.getMethod().getMethodName();
//Reporter.log("======"+methodName+"===Started=========", true);
		test = report.createTest(methodName);
		test.log(Status.INFO, "======" + methodName + "===Started=========");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log("======" + methodName + "===SUCCESS=========", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test = report.createTest(methodName);
		JavaUtility jutil = new JavaUtility();
		String dateTime = jutil.getSystemDateAndTimeForScreenshot();
		TakesScreenshot tks = (TakesScreenshot) BaseClass.sDriver;
		String temp = tks.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(temp, methodName + "_" + dateTime);
		test.log(Status.FAIL, "======" + methodName + "===FAILED=========");
//Reporter.log("======"+methodName+"===FAILED=========", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		Reporter.log("======" + methodName + "===SKIPPED=========", true);
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("Report Back up", true);
		report.flush();
	}
}

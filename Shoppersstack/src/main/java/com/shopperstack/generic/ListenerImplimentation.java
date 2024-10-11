package com.shopperstack.generic;

import java.io.File;
import java.io.IOException;

import java.time.LocalDateTime;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplimentation extends BaseClass implements ITestListener{
		ExtentReports report;
		ExtentTest test;
		
	@Override
	public void onTestStart(ITestResult result) {
		String Methodname = result.getMethod().getMethodName();
		
		System.out.println(Methodname+"<====== Testscript start execution----->");
		
		test=report.createTest(Methodname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String Methodname = result.getMethod().getMethodName();
		test.log(Status.PASS,Methodname+"-----passed");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getThrowable());
		
		String methodname = result.getMethod().getMethodName();
		
		String Timestamp = LocalDateTime.now().toString().replace(':', '-');
		driver = ((BaseClass) result.getInstance()).driver;
		TakesScreenshot s=(TakesScreenshot)driver;
	
		File src = s.getScreenshotAs(OutputType.FILE);
		File des=new File("./Screenshot/"+methodname+""+Timestamp+".png");
		try {
		FileUtils.copyFile(src, des);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		test.log(Status.FAIL, methodname+"----------Fail");
		test.log(Status.INFO, result.getThrowable());
	
		
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getThrowable());
		
		String Methodname = result.getMethod().getMethodName();
		
		test.log(Status.SKIP, Methodname+ "------Skipped");
		test.log(Status.INFO, result.getThrowable());
		
		
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		ExtentSparkReporter htmlreports = new ExtentSparkReporter(".\\ExtendReport\\Report="+timestamp+".html");
		htmlreports.config().setDocumentTitle("Shoppersstack");
		htmlreports.config().setReportName("Shoppersstack Execution Reports");
		htmlreports.config().setTheme(Theme.DARK);
	
		
		report=new ExtentReports();
		
		
		report.attachReporter(htmlreports);
		report.setSystemInfo("BasePlatform", "Windows");
		report.setSystemInfo("BaseBrowser", "ChromeBrowser");
		report.setSystemInfo("BaseUrl", "https://www.shoppersstack.com/");
		report.setSystemInfo("Environment", "Testing Environment");
		report.setSystemInfo("Report", "Santhosh");
		
	
		System.out.println("------Testsuite Started-------");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		System.out.println("------Testsuite Finished-------");
		
	}
			
	
			
}


package rest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport 
{
	public ExtentHtmlReporter htmlreporter;
public ExtentReports extent;
public ExtentTest test;
	@BeforeTest
	public void report()
	{
	htmlreporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"./reports/report.html");
	 extent=new ExtentReports();
	extent.attachReporter(htmlreporter);
	

	
	
	}
	@Test
	public void login()
	{
		test = extent.createTest("login");
		if(2==3)
			
			{
			test = extent.createTest("login");
			test.log(Status.PASS, "passed");
			
			System.out.println("hello");
			
			}
			
			else
			
			{
				test.log(Status.FAIL, "passed");
			
			
			
			}

	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
}

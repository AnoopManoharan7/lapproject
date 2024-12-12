package testNG;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extentreports {
	
	
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	String baseUrl="https://www.facebook.com/";
	@BeforeTest
	public void extentReport()
	{
		reporter=new ExtentHtmlReporter("./reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation report");
		reporter.config().setReportName("Functional Test");
		reporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("host name", "local host");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("tester name", "abc");
		extent.setSystemInfo("browser name", "chrome");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void befMethd()
	{
		driver.get(baseUrl);
	}
	@Test
	public void fbTitletest()
	{
		test=extent.createTest("Fb Title Verification");
		String exp="Facebook – log in or sign up";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, exp);
	}
	@Test
	public void fbLogotest()
	{
		test=extent.createTest("Fb Logo Verification");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
	}
	@AfterTest
	public void tearDown()
	{
		extent.flush();
	}
	@AfterMethod
	public void browserClose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is "+result.getName());
			test.log(Status.FAIL, "test case failed is "+result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
		else
		{
			test.log(Status.PASS, "test case passed is "+result.getName());
			
		}
	}

}

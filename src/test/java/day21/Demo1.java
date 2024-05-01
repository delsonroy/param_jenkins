package day21;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Demo1 {

	@Parameters({"gridURL", "appURL"})
	@Test
	public void testA(String gridURL, String appURL) throws Exception
	{
		
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark= new ExtentSparkReporter("report/Spark.html");
		report.attachReporter(spark);
		
		ExtentTest extentTest = report.createTest("testaA");
		
		extentTest.info("testA of Demo1 of 21"); 
        Reporter.log("Demo1 of testA...", true);    
        WebDriver driver = new RemoteWebDriver(new URL(gridURL), new EdgeOptions());
        driver.get(appURL);
        
        extentTest.info(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
        report.flush();
		
	}

}

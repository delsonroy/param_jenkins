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

public class Demo1 {

	@Parameters({"gridURL", "appURL"})
	@Test
	public void testA(String gridURL, String appURL) throws Exception
	{
        Reporter.log("Demo1 of testA...", true);    
        WebDriver driver = new RemoteWebDriver(new URL(gridURL), new EdgeOptions());
        driver.get(appURL);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();
		
	}

}

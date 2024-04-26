package day21;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test
	public void testA() throws Exception
	{
        Reporter.log("Demo1 of testA...", true);    
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), new EdgeOptions());
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.quit();
		
	}

}

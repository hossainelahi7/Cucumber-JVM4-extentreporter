package bdd.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import webDriver.Util.Driver;

public class BaseStep {
//	public static Driver driver;

	
	@Before
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium folder\\chromedriver.exe");
//        driver = new Driver (new ChromeDriver());
		System.out.println("Driver Created in Base Step. Thread: "+ Thread.currentThread().getId());
	}

	@After
	public void closeBrowser() {
//		driver.clearDriverInstance();
	}
	
}

package bdd.steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import runner.util.TestContext;
import webDriver.Util.Driver;

public class BaseStep {

	@Before
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium folder\\chromedriver.exe");
        Driver driver = new Driver (new ChromeDriver());
        TestContext context = new TestContext(driver, Thread.currentThread().getId()+"");
        TestContext.setDriver(Thread.currentThread().getId(), context);
		System.out.println("Driver Created in Base Step. Thread: "+ Thread.currentThread().getId());
	}

	@After
	public void closeBrowser() {
		TestContext.getContext(Thread.currentThread().getId())
			.getDriver().clearDriverInstance();
		TestContext.removeContext(Thread.currentThread().getId());
	}
	
}

package bdd.steps;

import bdd.Page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import webDriver.Util.Driver;

public class StepDef2{
//	private static Driver driver= BaseStep.driver;
	
	@Given("^I have (\\d+) cukes in my bellies$")
	public void iHaveCukesInMyBellies(int cukes) throws Throwable {
		System.out.println(Thread.currentThread().getId() + " - Cukes: "+ cukes+ " - in bellies");
//		driver.get("https://www.google.com/");
		System.out.println("Driver called in Step Def 2. Thread: "+ Thread.currentThread().getId());
	}
	
	@Then("^I should see canvas$")
	public void canSeeCanvus(){
//		HomePage page = new HomePage(driver);
//		Assert.assertTrue(page.canvas().isDisplayed());
	}

}

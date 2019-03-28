package bdd.steps;

import bdd.Page.CucumberHomePage;
import bdd.Page.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
import webDriver.Util.Driver;

public class StepDef2{	
	
	@Given("I am able to go to cucumber homepage")
	public void iAmAbleToGoToCucumberHomepage() {
		System.out.println("In 'iAmAbleToGoToCucumberHomepage', Current Thread is : "+Thread.currentThread().getId());
		CucumberHomePage page = new CucumberHomePage();
		page.gotoPage();
	}

	@Then("I should see cucumber icon")
	public void iShouldSeeCucumberIcon() {
		System.out.println("In 'iShouldSeeCucumberIcon', Current Thread is : "+Thread.currentThread().getId());
		CucumberHomePage page = new CucumberHomePage();
		Assert.assertTrue(page.getIcon().isDisplayed());
	}

/*	@Then("I should see search box")
	public void iShouldSeeSearchBox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}*/

/*	@Then("I should see {string} in search result")
	public void iShouldSeeInSearchResult(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
*/
	
/*	@Given("^I have (\\d+) cukes in my bellies$")
	public void iHaveCukesInMyBellies(int cukes) throws Throwable {
		System.out.println(Thread.currentThread().getId() + " - Cukes: "+ cukes+ " - in bellies");
//		driver.get("https://www.google.com/");
		System.out.println("Driver called in Step Def 2. Thread: "+ Thread.currentThread().getId());
	}
	
	@Then("^I should see canvas$")
	public void canSeeCanvus(){
//		HomePage page = new HomePage(driver);
//		Assert.assertTrue(page.canvas().isDisplayed());
	}*/

}

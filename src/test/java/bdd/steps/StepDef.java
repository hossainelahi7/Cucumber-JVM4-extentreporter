package bdd.steps;

import bdd.Page.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import webDriver.Util.Driver;

public class StepDef{
	
//	private static Driver driver= BaseStep.driver;
	
	@Given("^I have (\\d+) cukes in my belly$")
	public void iHaveCukesInMyBelly(int cukes){
		System.out.println(Thread.currentThread().getId() + " - Cukes: "+ cukes + " - in bally");
//		driver.get("https://www.google.com/");
		System.out.println("Driver called in Step Def. Thread: "+ Thread.currentThread().getId());
	}
	
	

	@When("^I print out the results$")
	public void iPrintOutTheResults(){
//		HomePage page = new HomePage(driver);
//		page.seachBOx().sendKeys("Selenium BDD");
	}
	
	@Then("^I should see seach results$")
	public void checkResult(){
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		HomePage page = new HomePage(driver);
//		Assert.assertTrue(page.searchSuggestions().size()>0);
	}

}

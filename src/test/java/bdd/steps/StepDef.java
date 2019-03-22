package bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDef {
	
	@Given("^I have (\\d+) cukes in my belly$")
	public void iHaveCukesInMyBelly(int cukes) throws Throwable {
		System.out.println(Thread.currentThread().getId() + " - Cukes: "+ cukes + " - in bally");
	}

	@Then("^I print out the results$")
	public void iPrintOutTheResults() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	}

}

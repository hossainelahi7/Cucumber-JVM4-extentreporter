package bdd.steps;

import cucumber.api.java.en.Given;

public class StepDef2 {

	@Given("^I have (\\d+) cukes in my bellies$")
	public void iHaveCukesInMyBellies(int cukes) throws Throwable {
		System.out.println(Thread.currentThread().getId() + " - Cukes: "+ cukes+ " - in bellies");
	}

}

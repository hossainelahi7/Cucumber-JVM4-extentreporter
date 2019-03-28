package bdd.steps;

import org.openqa.selenium.Keys;

import bdd.Page.GoogleHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef{
	
	
	@Given("^I am able to go to Google homepage$")
	public static void gotoGoogle(){
		System.out.println("In 'gotoGoogle', Current Thread is : "+Thread.currentThread().getId());
		GoogleHomePage google = new GoogleHomePage();
		google.gotoPage();
	}
	
	@When("^I am able to search \"([^\"]*)\"$")
	public static void Search(String searchText){
		System.out.println("In 'Search', Current Thread is : "+Thread.currentThread().getId());
		GoogleHomePage google = new GoogleHomePage();
		google.seachBOx().sendKeys(searchText+Keys.ENTER);
	}
	
	
/*	@Given("^I have (\\d+) cukes in my belly$")
	public void iHaveCukesInMyBelly(int cukes){
		System.out.println(Thread.currentThread().getId() + " - Cukes: "+ cukes + " - in bally");
//		driver.get("https://www.google.com/");
		System.out.println("Driver called in Step Def. Thread: "+ Thread.currentThread().getId());
	}*/
	
	

/*	@When("^I print out the results$")
	public void iPrintOutTheResults(){
//		HomePage page = new HomePage(driver);
//		page.seachBOx().sendKeys("Selenium BDD");
	}*/
	
	@Then("I should see search results")
	public void checkResult(){
		System.out.println("In 'checkResult', Current Thread is : "+Thread.currentThread().getId());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GoogleHomePage page = new GoogleHomePage();
		Assert.assertTrue(page.searchSuggestions().size()>0);
		System.out.println(page.searchSuggestions().toString());
	}
	
	@Then("I should see search box")
	public void iShouldSeeSearchBox() {
		System.out.println("In 'iShouldSeeSearchBox', Current Thread is : "+Thread.currentThread().getId());
		GoogleHomePage page = new GoogleHomePage();
		Assert.assertTrue(page.seachBOx().isDisplayed());
	}
	
	@Then("I should see {string} in search result")
	public void iShouldSeeInSearchResult(String string) {
		System.out.println("In 'iShouldSeeInSearchResult', Current Thread is : "+Thread.currentThread().getId());
		GoogleHomePage page = new GoogleHomePage();
		Assert.assertTrue(page.seachBOx().isDisplayed());
	}


}

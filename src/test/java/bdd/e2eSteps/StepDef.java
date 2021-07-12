package bdd.e2eSteps;

import cucumber.api.cli.Main;
import cucumber.api.java.en.When;

public class StepDef {

	@When("^user run \"([^\"]*)\"$")
	public void Search(String tag){
 		runTest(tag);
	}


	private void runTest(String tags){
		Integer threads = 4;
		String classpath = "classpath:bdd.steps";
		String featurePath = "src/test/resources/Features";
		String[] args1 = { "-p", "rerun:target/rerun.txt", "-p", "pretty", "-p", "html:target/report/cucumber-html-report", "-p",
				"json:target/report/cucumber.json", "-g", classpath, "-t", tags,
				"--threads", threads.toString(), featurePath};
		Byte results = Main.run(args1, Thread.currentThread().getContextClassLoader());
	}

}

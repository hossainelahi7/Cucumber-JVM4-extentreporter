package bdd.util;


import org.junit.Test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.cli.Main;
import cucumber.api.junit.Cucumber;



public class TestRunnerParallel {
	 
//	 @Test
	public void test() throws Throwable {
		Main.main(new String[]{
				"--threads", "4",
				"-p", "html:target/cucumber/",
				"-p", "pretty",
        		"-p", "json:target/cucumber/cucumber.json",
        		"-p", "junit:target/cucumber/cucumber.xml",
        		/*"-p", "usage:target/cucumber/cucumber-usage.json",*/
        		/*"-p", "com.sitture.ExtentFormatter:target/output/extent-report/index.html",*/ 
				"-g", "bdd.steps", "src/test/resources"});
	}

	
}

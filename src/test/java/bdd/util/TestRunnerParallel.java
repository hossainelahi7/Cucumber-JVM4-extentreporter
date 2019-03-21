package bdd.util;


import org.junit.Test;
import cucumber.api.cli.Main;

public class TestRunnerParallel {
	 
//	 @Test
	public void test() throws Throwable {
		Main.main(new String[]{
				"--threads", "2",
				"-p", "html:target/cucumber/",
				"-p", "pretty:target/cucumber/cucumber-pretty.txt",
        		"-p", "json:target/cucumber/cucumber.json",
        		"-p", "junit:target/cucumber/cucumber.xml",
        		"-p", "usage:target/cucumber/cucumber-usage.json",
        		"-p", "com.sitture.ExtentFormatter:target/output/extent-report/index.html", 
				"-g", "bdd.steps", "src/test/resources"});
	}

	
}

package bdd.util;

import cucumber.api.cli.Main;

public class MainRunner {
	public  static void main(String[] args){
		Integer threads = 1;
		String classpath = "classpath:bdd.e2eSteps";
		String tags = "@Scenario_one";
		String featurePath = "src/test/resources/E2E-Features";
		String[] args1 = { "-p", "rerun:target/rerun.txt", "-p", "pretty", "-p", "html:target/report/cucumber-html-report", "-p",
				"json:target/report/cucumber.json", "-g", classpath, "-t", tags,
				"--threads", threads.toString(), featurePath};
		Byte results = Main.run(args1, Thread.currentThread().getContextClassLoader());
	}
}

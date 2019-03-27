package bdd.util;

import org.junit.runner.RunWith;


import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features"},
        glue = {"bdd.steps" }, 
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty", 
        		"html:target/cucumber", 
        		"json:target/cucumber/cucumber.json",
        		"junit:target/cucumber/cucumber.xml"}
        )

public class TestRunner {
	
}

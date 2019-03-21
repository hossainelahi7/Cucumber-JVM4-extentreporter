package bdd.util;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.sitture.ExtentReporter;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"bdd.steps" }, 
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty", 
        		"html:target/cucumber", 
        		"json:target/cucumber/cucumber.json",
        		"junit:target/cucumber/cucumber.xml"
        		"com.sitture.ExtentFormatter:target/output/extent-report/index.html"}
)
public class TestRunner {

	
}

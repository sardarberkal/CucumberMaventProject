package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Feature", 
					glue = {"stepDefinitions"} ,strict = true )

public class TestRunner {

}
	
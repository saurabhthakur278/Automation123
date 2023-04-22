package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefination",dryRun=true,
		plugin= {"pretty","html:target/cucumber.html"}
		
		)

public class TestRunner {

}

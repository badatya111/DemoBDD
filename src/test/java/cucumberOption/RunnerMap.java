package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features/HomePage.feature", 
          glue="stepDefination",plugin={"pretty","html:target/cucumber-html.html","json:target/cucumber-json.json",
				  "junit:target/cucumber-junit.xml"}
		  )

public class RunnerMap {
	
}

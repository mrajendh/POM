package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@CucumberOptions(features="src/test/java/feature/CreateLead.feature",glue= {"steps","utils","wdMethods","pages"}
)
@RunWith(Cucumber.class)

public class RunCucumber {

	
}

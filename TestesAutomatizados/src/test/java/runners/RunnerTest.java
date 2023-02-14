package runners;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "src/test/java/stepsDefinitions/TesteSteps",
		//glue = "stepsDefinitions",
		dryRun = false
		)

public class RunnerTest {
	
}

package Tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //monochrome = true,
        features = "src/main/java/feature",
        glue = {"StepDefinitions"}
)

public class TestRun {

}

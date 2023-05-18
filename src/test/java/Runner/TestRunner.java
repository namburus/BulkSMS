package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//runner class which can run the multiple feature files.
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features", glue = {"StepDefinitions", "Hooks"},
        monochrome = true, publish = true,
        plugin = {"pretty", "html:target/HtmlReports"})

public class TestRunner {

}



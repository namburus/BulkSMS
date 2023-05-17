package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/features", glue = {"StepDefinitions", "Hooks"},
        monochrome = true, publish = true,
        plugin = {"pretty", "html:target/HtmlReports"})

public class TestRunner {

}



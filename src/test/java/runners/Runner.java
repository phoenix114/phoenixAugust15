package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {"html:target/ExpensesModul","json:target/report.json"},
        features = "src/test/resources/schoolFeatures",
        glue = "steps",
        tags = "@Bea1",
        dryRun = false

)
public class Runner {

}

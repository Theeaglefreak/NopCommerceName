package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = ".//Features//Customers.feature",
        glue ="stepdefinations", dryRun = false , monochrome = true,
        plugin = {"pretty", "html:report/test-output"}
)


public class Runner {
}


package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "stepDefinitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports.html",  // HTML Report
        "json:target/cucumber-reports.json",  // JSON Report
        "junit:target/cucumber-reports.xml"   // JUnit XML Report
    },
    monochrome = true
)
public class TestRunner {
}

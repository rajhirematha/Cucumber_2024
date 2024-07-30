package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features",glue={"StepDefinitions"},
monochrome = true,
        plugin = {"html:target/HtmlReports/report.html"}
//        plugin = {"json:target/JsonReport/report.json"}
//        plugin = {"junit:target/JunitReports/report.xml"}
)
public class TestRunner {
}

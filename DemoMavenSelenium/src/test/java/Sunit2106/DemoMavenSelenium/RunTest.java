package Sunit2106.DemoMavenSelenium;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Demo.feature",
        glue="StepDefinitions",
        plugin = { 
                    "pretty",
                    "html:target/cucumber",
                } 

        )
public class RunTest {
}
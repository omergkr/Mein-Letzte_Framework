package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(

        tags ={"@RegressionTest"},
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        dryRun = false,
        plugin = {"html:target/cucumber-report","json:target/cucumber.json"}



)




public class RunnerJson extends AbstractTestNGCucumberTests {




}

package runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags ={"@RegressionTest"},
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        dryRun = false,
        plugin = {


                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        }
)


public class RunnerExtent extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass()
    {
        Reporter.loadXMLConfig("src/test/java/xmlFiles/extentReportSet.xml");


        Reporter.setSystemInfo("User Name","omer Goker");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Operating System Info",System.getProperty("os.name"));
        Reporter.setSystemInfo("Department","QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber report");


    }


}

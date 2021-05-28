package runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.Driver;

@CucumberOptions(
        tags ={"@RegressionTest"},
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        dryRun = false,
        plugin = {

                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"

        }
)

public class RunnerCrossBrowser extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters("browser")
    public static void beforClass(String browser)
    {
        Driver.threadBrowserName.set(browser);

    }



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

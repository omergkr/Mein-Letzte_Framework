package stepDefinitions;

import utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ExcelUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {


    @Before
    public void before(Scenario scenario){

        System.out.println("Scenario started");
        System.out.println(scenario.getId()+ " scenario id");
        System.out.println(scenario.getName()+ " scenario name");

    }


    @After
    public void after(Scenario scenario){

        System.out.println("Scenario finished");
        System.out.println("Scenario result: "+scenario.getStatus());

        Date now =new Date();
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH mm ss");
        String strDate=formatter.format(now);
        strDate=strDate.replaceAll(":","_");


        if (scenario.isFailed()){

            String scenarioName=scenario.getName();

            TakesScreenshot ts =(TakesScreenshot) Driver.getDriver();
            File screenshotFile=ts.getScreenshotAs(OutputType.FILE);

            try {
                FileUtils.copyFile(screenshotFile,new File("target/FailedScreenShots/"+Driver.threadBrowserName.get()+scenarioName+strDate+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }



        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ExcelUtil.wirteExcel(scenario,strDate,Driver.threadBrowserName.get());

        Driver.quitDriver();
    }


}

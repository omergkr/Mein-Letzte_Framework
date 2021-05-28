package stepDefinitions;


import gherkin.lexer.El;
import pages.ConvertElement;
import pages.ElementName;
import pages.LoginPage;
import utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    WebDriver driver;

    @Given("Navigate to Website")
    public void navigateToWebsite() {

        driver= Driver.getDriver();
        driver.get("https://test.basqar.techno.study/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @When("Enter username and Password and Click Login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {

        ConvertElement convertElement=new ConvertElement();
        convertElement.sendKeysTo(ElementName.username,"daulet2030@gmail.com");
        convertElement.sendKeysTo(ElementName.password,"TechnoStudy123@");
        convertElement.clickTo(ElementName.loginButton);
        convertElement.clickTo(ElementName.gotItButton);



//        LoginPage loginPage=new LoginPage();
//
//        loginPage.findElementAndSendKeys("username", "daulet2030@gmail.com");
//        loginPage.findElementAndSendKeys("password", "TechnoStudy123@");
//        loginPage.findElementAndClick("loginButton");
//        loginPage.findElementAndClick("gotItButton");


    }
}

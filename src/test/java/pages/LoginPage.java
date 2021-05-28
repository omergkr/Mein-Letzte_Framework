package pages;

import utilities.Driver;
import utilities.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

     WebElement currentElement;

    public LoginPage() {

       PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="mat-input-0")
    public WebElement username;

    @FindBy (id="mat-input-1")
    public WebElement password;

    @FindBy (css="button[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy (linkText="Got it!")
    public WebElement gotItButton;


    public void findElementAndClick(String elementname){


        switch (elementname)
        {

            case "loginButton":
                currentElement=loginButton;
                break;


            case "gotItButton":
                currentElement=gotItButton;
                break;



        }

       Methods.clickFunction(currentElement);
    }

    public void findElementAndSendKeys(String elementname,String value){


        switch (elementname)
        {

            case "username":
                currentElement=username;
                break;

            case "password":
                currentElement=password;
                break;

        }

        Methods.sendKeysFunction(currentElement,value);
    }

    public void findElementAndVerifyContainsText(String elementname,String mesaj,String textorValue){

        switch (elementname){

//            case "settingsTitle":
//                currentElement=settingsTitle;
//                break;





        }


        Methods.verifyElement(currentElement,mesaj,textorValue);

    }
}

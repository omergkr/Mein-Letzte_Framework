package pages;

import org.openqa.selenium.WebElement;
import utilities.Methods;

import java.lang.reflect.Field;


public class ConvertElement {

    WebElement myElement;

    public WebElement getElementFrom(ElementName elementName) {
        Field field;
        LoginPage objectInstance = new LoginPage();
        WebElement value = null;

        try {

            field = LoginPage.class.getDeclaredField(elementName.toString());
            value = (WebElement) field.get(objectInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }



    public void clickTo(ElementName elementName) {
        myElement = getElementFrom(elementName);
       Methods.clickFunction(myElement);
     //   myElement.click();
    }


    public void sendKeysTo(ElementName elementName, String value) {
        myElement = getElementFrom(elementName);
        Methods.sendKeysFunction(myElement, value);
      //  myElement.sendKeys(value);
    }


    public void verifyContainsText(ElementName elementName, String msg,String value) {
        myElement = getElementFrom(elementName);
        Methods.verifyElement(myElement, msg,value);
    }





}

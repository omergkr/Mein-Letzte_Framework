package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();



    public static WebDriver getDriver() {


        if (threadBrowserName.get() == null) {

            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null) {

            switch (threadBrowserName.get()) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver());
                    break;

            }


        }

        return threadDriver.get();

    }



    public static void quitDriver(){

        if (threadDriver.get()!=null){

            threadDriver.get().quit();
            WebDriver driver=threadDriver.get();
            driver=null;

            threadDriver.set(driver);


        }


    }



}

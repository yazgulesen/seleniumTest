package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Util {
    //create a package and name it as utils
    //create a class and name as CommonMethods
    //create functions (methods) to open and close and quit the browsers
    //open method has to accept a url as a parameter
    public static WebDriver driver;//it will only run if the driver is already instantiated in the preceding code

    public static void openBrowser(String url){
        System.setProperty("webdriver.crome.driver","driver/chromedriver");
        driver= new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    public static void closeBrowser(){
        if(driver!=null){
            driver.close();//we put if condition so user don't close anything if there is no driver
                            // add on restriction for the user not mess up when using this method
        }
    }

    public static  void  quitBrowser(){
        if(driver!=null){
            driver.quit();//same here so user when using the method doesn't quit something else
        }
    }

}

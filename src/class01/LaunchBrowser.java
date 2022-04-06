package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("https://www.google.com/");//navigate to browser
         String url = driver.getCurrentUrl();//get url
        System.out.println(url);
        String title = driver.getTitle();//get title
        System.out.println(title);
        driver.quit();// when we are done with testing
    }

    public static class Task1 {
        /*1. launch the browser
          2.navigate to amazon website
          3.printout the title and url on console
          4.close the browser
         */
        public static void main(String[] args) {
            //set the properties
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            WebDriver driver = new ChromeDriver();//launch the browser with blank page
            driver.get("https://www.amazon.com/");
             String url = driver.getCurrentUrl();
           String title =  driver.getTitle();
            System.out.println(url+" "+title);
            driver.quit();
        }
    }
}

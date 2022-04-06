package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver"," drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //naviagte command
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().forward();
        //pause the refresh process, rarely used just to show the process.
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.close();// closing current tab
        driver.quit();//quit the whole browser
    }
}

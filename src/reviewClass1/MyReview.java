package reviewClass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class MyReview {
    public static void main(String[] args) throws InterruptedException {
        //set system property
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //to open chrome driver
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.google.com/");
        //WebDriver class methods
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().refresh();// same as f5 in the browser
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().back();
        driver.close();
        //driver.quit();



    }
}

package class7.HandlingMultipleWindows.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task2 {
    //navigate to http://www.uitestpractice.com/Students/Contact
    //click on the link
    //get text
    //print out in the console
    public static String url ="http://www.uitestpractice.com/Students/Contact";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.linkText("This is a Ajax link"));
        link.click();
       Thread.sleep(20000);
        WebElement text = driver.findElement(By.tagName("p"));
        System.out.println(text.getText());
        driver.quit();

    }
}

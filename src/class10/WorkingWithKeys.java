package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeys {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));//username /we get an web element in return.
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password")); //password
        password.sendKeys("test", Keys.ENTER);
        //WebElement loginButton= driver.findElement(By.className("button"));
        //loginButton.click();//log in button
        //if it enters the login why we need locate loginbutton, because we need verify that that login button is there
        // Key.tab---> it will act like go next one / or like tab button
        //Keys is enum (from selenium)  is used to automate same actions our keyboard will take
        // Keys.Enter---> clicks actions

    }
}
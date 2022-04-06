package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrders {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        WebElement username = driver.findElement(By.name("ctl00_MainContent_username"));//for reusibility
        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.name("ctl00_MainContent_password"));
        password.sendKeys("test");

        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();
        /*he stores all of that information inside a new variable an calls that variables username so then he doesnt
       have to type all that long stuff when he needs to access username he can reach to that by saying username,
        if he didnt assign it to a variable then we need do driver.findElement(By.id("ctl00_MainContent_username"));
        each time we want to work with that element*/

    }
}

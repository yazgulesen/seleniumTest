package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {
    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //navigate to amazon and hover over accounts and lists elements
        WebElement accountAndLists = driver.findElement(By.id("nav-link-accountList"));
        Actions actions = new Actions(driver);//pass my driver object since we are working with that
        actions.moveToElement(accountAndLists).perform();



    }
}

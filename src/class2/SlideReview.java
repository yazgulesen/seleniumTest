package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SlideReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.uniqlo.com/us/en/contents/collaboration/uniqlo-u/22ss/");
        driver.findElement(By.className("DrawerTrigger_Text")).click();

    }
}

package reviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
       WebElement userName = driver.findElement(By.id("userName"));
       userName.sendKeys("gowheresen");
       Thread.sleep(5000);
       userName.clear();
       userName.sendKeys("esengowher");

    }
}

package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathSR {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.target.com/");
        driver.findElement(By.xpath("//input[@placeholder = 'Search']")).sendKeys("girls hat");
        driver.findElement(By.tagName("button")).click();
        driver.findElement(By.xpath("//img[contains(@alt,'Straw')]"));
    }
}

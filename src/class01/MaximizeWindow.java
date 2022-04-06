package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedrivers");//second" " is path
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();//it maximize the window, not used much
        driver.manage().window().fullscreen();//when full you can't navigate through tabs
    }
}

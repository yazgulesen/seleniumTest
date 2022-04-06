package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
      public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //Open Chrome browser
        WebDriver driver = new ChromeDriver();
        // Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // Enter valid username and password (username - Admin, password - Hum@nhrm123)
        WebElement userName = driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id= 'txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        //Click on login button
        WebElement clickButton = driver.findElement(By.cssSelector("input#btnLogin"));
        clickButton.click();
        //Thread.sleep(2000);
        //Then verify Syntax Logo is displayed.
        System.out.println(driver.findElement(By.cssSelector("img[src*= 'human']")).isDisplayed());
          driver.quit();
    }
}

package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        //HRMS Application Negative Login:
        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //Enter valid username
        //Leave password field empty
        WebElement userName = driver.findElement(By.xpath("//input[@id= 'txtUsername']"));
        userName.sendKeys("Admin");
        //Click on login button
        WebElement clickButton = driver.findElement(By.cssSelector("input#btnLogin"));
        clickButton.click();
        //Verify error message with text "Password cannot be empty" is displayed.
        WebElement error = driver.findElement(By.id("spanMessage"));
        if(error.isDisplayed()){
            System.out.println("Password can not be empty");
        }
        driver.quit();
    }

    public static class Amazondropdown {
        public static String url = "https://www.amazon.com/";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement categoriesDD=driver.findElement(By.id("searchDropdownBox"));
            Select select = new Select(categoriesDD);
            List<WebElement> options = select.getOptions();
            for(WebElement option:options){
                String optionText = option.getText();
                System.out.println(optionText);
            }

        }
    }
}

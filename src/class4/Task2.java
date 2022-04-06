package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        //Open chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Go to "https://www.amazon.com/"
        driver.get("https://www.amazon.com/");
        //Get all links
        List<WebElement> links =  driver.findElements(By.tagName("a"));
        System.out.println("Number of all links is: "+links.size());
        //Print to console only the links that has text
        for(WebElement link:links){
            String textLink=link.getText();
            String allLink=link.getAttribute("href");
            if(!textLink.isEmpty()){
                System.out.println(textLink+" "+args);
            }
        }
        driver.quit();
    }
}

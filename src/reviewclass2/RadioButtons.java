package reviewclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement radioButton = driver.findElement(By.xpath("//input[@value= 'Female' and @name = 'optradio']"));//multiple attribute get unique element
        radioButton.click();

        //check if the radioButton is enabled
        System.out.println(" the female radio button is enabled " + radioButton.isEnabled());

        //check if the radio button female is displayed
        System.out.println(" the female radio button is didplayed" + radioButton.isDisplayed());

        // if radiobutton selected or not
        if (!radioButton.isSelected()) {
            radioButton.click();
            System.out.println(" the female radio button is selected" + radioButton.isSelected());
        }

        //to get all the links in the current webpage
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : allLinks) {
            String name = link.getText();
            if (!name.isEmpty()) {
                System.out.println(name);
            }
        }
        driver.quit();
    }
}








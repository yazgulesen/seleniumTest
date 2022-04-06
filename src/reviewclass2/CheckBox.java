package reviewclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");

        //check the checkBox
        WebElement checkBox1 = driver.findElement(By.cssSelector("input#isAgeSelected"));
        checkBox1.click();
        //checkBox1.isSelected();
        //checkBox1.isEnabled();
       // checkBox1.getText();//if the there is no text there is no reason to use this method
        Thread.sleep(2000);
        //diSelecting the checkbox
        checkBox1.click();
        // printing the checkBox on console-- first find element and get the text
      WebElement textDisplay = driver.findElement(By.xpath("//div[text() = 'Success - Check box is checked']"));
        System.out.println(textDisplay.getText());

        //get all the available options
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class= 'cb1-element']"));
        for(WebElement checkB:checkBoxes){
            checkB.click();
        }
        Thread.sleep(2000);
        //diSelect the checkboxes
        for(WebElement checkB:checkBoxes){
            checkB.click();
        }

       //driver.quit();

    }
}

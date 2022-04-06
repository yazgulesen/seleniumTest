package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingMultipleSelectDD {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.name("States"));
        Select select = new Select(statesDD);
         boolean isMultiple = select.isMultiple();//to check if Dropdown is multiple select
        System.out.println(isMultiple);

        //want to check is dropdown multiple I want to interact with them
        if(isMultiple){
            List<WebElement> options = select.getOptions();
            for(WebElement option:options){
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);

            }
        }
        //diSelect the values is same how you selecting /3 way to do it
          //select.deselectByIndex(5);
        select.deselectAll();
        driver.quit();
    }
}

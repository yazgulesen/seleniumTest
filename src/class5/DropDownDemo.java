package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {

    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement daysDropdown =driver.findElement(By.id("select-demo"));//identifing
            Select select = new Select(daysDropdown); //create an object of Select class to interact with elements

            /*different  ways of selecting dropdowns
            select.selectByIndex(3);//select by index
            select.selectByVisibleText("Thursday");//select by visible text
            select.selectByValue("Sunday");// selecting by value
            // interacting with all elements*/

            List<WebElement> allOptions = select.getOptions();//
            int size = allOptions.size();
            System.out.println(size);
            // want to get all elements
            for(int i =1; i<size;i++){
               String option = allOptions.get(i).getText();// get text for each element
                System.out.println(option);
                select.selectByIndex(i);
                Thread.sleep(1000);
            }
            driver.quit();


    }

}


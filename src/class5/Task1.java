package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1 {
    //TC 1: Facebook dropdown verification
    public static String url = "https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {

        //Open Chrome browser
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Go to "https://www.facebook.com"
        driver.get(url);

        //click on create new account
         WebElement month = driver.findElement(By.linkText("Create new account"));
         month.click();
         Thread.sleep(3000);
        //Verify month dd has 12 months options
        WebElement monthDD = driver.findElement(By.name("birthday_month"));
        Select select = new Select(monthDD);
        List<WebElement> options = select.getOptions();
        int monthSize = options.size();
        if(monthSize==12){
            System.out.println("Dropdown has "+ monthSize+" months option");
        }else{System.out.println("no 12 months option");}

        // verify day dd has 31 days options
        WebElement dayDD = driver.findElement(By.id("day"));
        Select select1 = new Select(dayDD);
        List<WebElement> options1 = select1.getOptions();
        int daySize = options1.size();
        if(daySize==31){
            System.out.println("positive");
        }else{System.out.println("negative");}

        // verify year dd has 115-year options
        WebElement yearDD = driver.findElement(By.id("year"));
        Select select2 = new Select(yearDD);
        List<WebElement> options2 = select2.getOptions();
        int yearSize = options2.size();
        if(yearSize==115){
            System.out.println("psitive");
        }else{System.out.println("negative");}

          //Select your date of birth
        select.selectByIndex(4);
        select1.selectByValue("14");
        select2.selectByVisibleText("1992");
        //Quit browse
        driver.quit();

    }
}

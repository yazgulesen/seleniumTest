package reviewclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com");
        WebElement createNewAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createNewAccount.click();

        //get the desired dropdown
        Thread.sleep(2000);
       WebElement dayDD =  driver.findElement(By.cssSelector("select#day"));
       // noSuchSelectException error means put sleep so it gives webpage time upload that code
        Select select = new Select(dayDD);
        select.selectByValue("5");
        Thread.sleep(2000);
        select.selectByIndex(3);
        Thread.sleep(2000);
        select.selectByVisibleText("20");

        //print all the options of dropdown
        List<WebElement> options = select.getOptions();//getOptions() from Select class
        for(WebElement option:options){
            System.out.println(option.getText());
            //Thoption.getAttribute("value");
        }


            driver.quit();


    }
}

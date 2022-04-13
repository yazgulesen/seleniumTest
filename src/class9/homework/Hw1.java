package class9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Hw1 {
    ///*
    //http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
    //click on leave
    //click on leave list
    //choose from "To calendar"
    //click only on cancelled and rejected checkboxes
    //uncheck Pending Approval
    //select IT support from DD
    //click search
    //quit the browser
    // */
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //login
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        //click on leave
        WebElement leaveButton = driver.findElement(By.xpath("//b[text()='Leave']"));
        leaveButton.click();
        //click on leave list
        WebElement leaveListBtn = driver.findElement(By.xpath("//a[text()='Leave List']"));
        leaveListBtn.click();

        //choose from "From calendar"
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();
        //selecting the month
        WebElement monthDD = driver.findElement(By.cssSelector("select.ui-datepicker-month"));
        Select select = new Select(monthDD);
        select.selectByVisibleText("Aug");
        List<WebElement> fromDates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']/tbody/tr/td"));

        for (WebElement fromDate : fromDates) {
            String dataText = fromDate.getText();// to get each date of calendar later we can check if it is our desired date
            if (dataText.equals("25")) {
                fromDate.click();
                break;
            }
        }
        //choose from "To calendar"
        WebElement toCalendar = driver.findElement(By.id("calToDate"));
        toCalendar.click();
        WebElement monthDD2 =driver.findElement(By.className("ui-datepicker-month"));
        Select select1 = new Select(monthDD2);
        select1.selectByValue("8");
         List<WebElement> toDates = driver.findElements(By.xpath("//table[@class ='ui-datepicker-calendar']/tbody/tr/td"));
         for(WebElement toDate:toDates){
             String dateText = toDate.getText();
             if(dateText.equals("4")){
                 toDate.click();
                 break;
             }
         }
        //click only on cancelled and rejected checkboxes
        WebElement rejectCheckBox = driver.findElement(By.xpath("//input[@value ='-1']"));
         rejectCheckBox.click();
        WebElement cancelCheckBox = driver.findElement(By.xpath("//input[@value ='0']"));
        cancelCheckBox.click();
        //uncheck Pending Approval
        WebElement pendingCheckBox = driver.findElement(By.xpath("//input[@value ='1']"));
        pendingCheckBox.click();
        //select IT support from DD
        WebElement subDD = driver.findElement(By.id("leaveList_cmbSubunit"));
        Select select2 = new Select(subDD);
        select2.selectByVisibleText("IT Support");
        //click search
        WebElement searchBtn = driver.findElement(By.id("btnSearch"));
        searchBtn.click();
        driver.quit();

    }
}

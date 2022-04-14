package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingCalendarsPart2 {
    public static String url ="https://www.delta.com/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        //driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement calendar = driver.findElement(By.id("input_departureDate_1"));
        calendar.click();

        WebElement nextButton = driver.findElement(By.xpath("//span[text()= 'Next']"));
        WebElement departureMonth = driver.findElement(By.className("dl-datepicker-month-0"));//go left
        String dMonthText = departureMonth.getText();
      // select departure month/left hand sight
        while(!dMonthText.equals("August")){
        //nextButton = driver.findElement(By.xpath("//span[text()= 'Next']"));
            nextButton.click();
            //reassing the value and get the text
            dMonthText = departureMonth.getText();

        }
        //select departing Date
        List<WebElement> dDates = driver.findElements(By.xpath("//tbody[@class= 'dl-datepicker-tbody-0']/tr/td"));
        for(WebElement dDate:dDates){
            if(dDate.getText().equals("13")){
                dDate.click();
                break;
            }
        }

        //select returning month
       WebElement returningMonth= driver.findElement(By.className("dl-datepicker-month-1"));//go to right
       String rMonthText = returningMonth.getText();
       while(!rMonthText.equals("November")){
           nextButton.click();
           rMonthText= returningMonth.getText();

       }

        List<WebElement> returnDates = driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
       for(WebElement returnDate:returnDates){
           if(returnDate.getText().equals("30")){
               returnDate.click();
               break;
           }
       }
       //click on doneButton
        WebElement doneButton = driver.findElement(By.className("donebutton"));
       doneButton.click();

    }
}
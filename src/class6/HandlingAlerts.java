package class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

         WebElement  simpleAlertButton = driver.findElement(By.id("alert"));
         simpleAlertButton.click();
         driver.switchTo().alert();// switching selenium focus on this alert
         Alert simpleAlert = driver.switchTo().alert();// creating object of Alert interface in order use Alert interface methods
        Thread.sleep(3000);
         simpleAlert.accept();//click ok/ always positive/handling simple alert

         WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
         confirmAlertButton.click();
         Thread.sleep(3000);
         Alert alert = driver.switchTo().alert();
          String alertText = confirmAlertButton.getText();
        System.out.println(alertText);
       alert.dismiss();//

        //prompt alerts

        WebElement confirmPromptButton = driver.findElement(By.cssSelector("button#prompt"));
        confirmPromptButton.click();
        Thread.sleep(3000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("the batch 12 the best");
        promptAlert.accept();//click ok

        //driver.quit();

    }
}

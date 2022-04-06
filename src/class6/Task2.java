package class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    //Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    //click on each button and handle the alert accordingly
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://syntaxprojects.com/javascript-alert-box-demo.php");

        Thread.sleep(2000);
        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick= 'myAlertFunction()']"));
        alertButton.click();
        Alert alert1 =  driver.switchTo().alert();
        alert1.accept();

        Thread.sleep(3000);
        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick= 'myConfirmFunction()']"));
        confirmButton.click();
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        Thread.sleep(3000);

        WebElement promptButton = driver.findElement(By.xpath("// button[text()= 'Click for Prompt Box']"));
        promptButton.click();
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Great effort!");
        alert3.accept();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.quit();}}

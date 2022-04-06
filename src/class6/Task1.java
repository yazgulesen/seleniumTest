package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Navigate to https://syntaxprojects.com/bootstrap-iframe.php
        driver.navigate().to(url);

        //verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
        WebElement headerText = driver.findElement(By.cssSelector("span.gum"));
        if(headerText.isDisplayed()){
            System.out.println("positive");}
        else{
            System.out.println("negative");}
        Thread.sleep(3000);
         //verify enroll today button is enabled
        driver.switchTo().frame("FrameTwo");
        WebElement enrollButton = driver.findElement(By.xpath("//div[text () = 'Enroll today']"));
        if(enrollButton.isEnabled()){
            System.out.println("postive");}
        else{
            System.out.println("negative");}
        Thread.sleep(3000);
        driver.quit();}
}

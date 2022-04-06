package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();//launch the browser with blank page
        driver.get("http://fb.com/");
        //gow find and element which has id which has the value the email
        driver.findElement(By.id("email")).sendKeys("iamyazgul@gmail.com");//write information on email part
        driver.findElement(By.id("pass")).sendKeys("nonsense");//pass the password field
        driver.findElement(By.name("login")).click();//click on the login button
        Thread.sleep(2000);
        //driver.findElement(By.linkText("Forgot password?")).click();//it go fast
          driver.findElement(By.partialLinkText("Forgot")).click();//took just part of the link
        driver.quit();

    }
}

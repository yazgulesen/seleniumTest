package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTask1 {
/**
 * Task
 * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
 * Login
 * Get title and verify
 * logout
 * close the browser
 */
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
    WebDriver driver = new ChromeDriver();
    driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
    driver.findElement(By.name("ctl00_MainContent_username")).sendKeys("Tester");//login part, passing some keys
    driver.findElement(By.name("ctl00_MainContent_password")).sendKeys("test");
    driver.findElement(By.className("button")).click();
    String title = driver.getTitle();
    if(title.equals("Web Orders")){
        System.out.println("Title is correct");
    }else{

        System.out.println("Not correct");
    }

    driver.findElement((By.linkText("ctl00_logout"))).click();
    driver.quit();
}

}

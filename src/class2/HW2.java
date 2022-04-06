package class2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //navigate to fb.com
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        //click on create new account
        driver.findElement(By.linkText("Create new account")).click();
        //fill up all the textboxes
        Thread.sleep(3000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastName = driver.findElement(By.name("lastname"));
        firstName.sendKeys("gowher");
        lastName.sendKeys("esen");

        driver.findElement(By.id("month")).sendKeys("November");
        driver.findElement(By.id("day")).sendKeys("12");
        driver.findElement(By.id("year")).sendKeys("1980");
        WebElement Gender=driver.findElement(By.className("_58mt"));
        Gender.click();
        driver.findElement(By.name("reg_email__")).sendKeys("aimgowher@gmail.com");
        WebElement ConfirmEmail= driver.findElement(By.name("reg_email_confirmation__"));
        ConfirmEmail.sendKeys("aimgowher@gmail.com");
         WebElement password = driver.findElement(By.id("year"));
                 password.sendKeys("12345678");
        driver.findElement(By.id("password_step_input")).sendKeys("dertg341!");

        //click on sign up button
        Thread.sleep(5000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(5000);
        //close the pop-up
        driver.findElement(By.cssSelector("img[class='_8idr img']")).click();
        //close the browser
        Thread.sleep(4000);
        driver.close();

    }
}

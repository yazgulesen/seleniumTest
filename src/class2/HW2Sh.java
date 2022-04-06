package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2Sh {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        WebElement Signup=driver.findElement(By.linkText("Create new account"));
        Thread.sleep(2000);
        Signup.click();
        Thread.sleep(2000);
        WebElement FirstName = driver.findElement(By.name("firstname"));
        FirstName.sendKeys("Syntax");

        WebElement LastName = driver.findElement(By.name("lastname"));
        LastName.sendKeys("Tech");

        WebElement Email=driver.findElement(By.name("reg_email__"));
        Email.sendKeys("syntax@gmail.com");

        WebElement ConfirmEmail= driver.findElement(By.name("reg_email_confirmation__"));
        ConfirmEmail.sendKeys("syntax@gmail.com");

        WebElement Password=driver.findElement(By.id("password_step_input"));
        Password.sendKeys("Test1234");

        WebElement BirthdayMonth= driver.findElement(By.id("month"));
        BirthdayMonth.sendKeys("Aug");

        WebElement BirthDate=driver.findElement(By.id("day"));
        BirthDate.sendKeys("12");

        WebElement BirthYear=driver.findElement(By.id("year"));
        BirthYear.sendKeys("1990");

        WebElement Gender=driver.findElement(By.className("_58mt"));
        Gender.click();

        WebElement Register=driver.findElement(By.name("websubmit"));
        Thread.sleep(2000);
        Register.click();

        Thread.sleep(2000);
        driver.close();

    }
}


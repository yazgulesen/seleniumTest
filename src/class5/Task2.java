package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task2 {
    //Go to facebook sign up page
    //Fill out the whole form
    //Click signup
    public static String url= "https://m.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        //Go to facebook sign up page
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Fill out the whole form
        WebElement createNewAccountB = driver.findElement(By.xpath("//a[@role= 'button']"));
        Thread.sleep(2000);
        createNewAccountB.click();
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Jordan");
        Thread.sleep(2000);
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Page");
        Thread.sleep(2000);
        WebElement nextButton = driver.findElement(By.xpath("//button[@type = 'submit']"));
       nextButton.click();
        Thread.sleep(2000);
        //month
        WebElement birthMonth = driver.findElement(By.xpath("//select[@id = 'month']"));
        Select obj1 = new Select(birthMonth);
        obj1.selectByIndex(4);
        //day
        WebElement birthDay = driver.findElement(By.xpath("//select[@id = 'day']"));
        Select obj2 = new Select(birthDay);
        obj2.selectByValue("4");
        //year
        WebElement birthYear = driver.findElement(By.xpath("//select[@id = 'year']"));
        Select obj3 = new Select(birthYear);
        obj3.selectByVisibleText("1988");
        Thread.sleep(2000);
        WebElement nextButton1 = driver.findElement(By.xpath("//button[@type = 'submit']"));
        nextButton1.click();
        //phone

       WebElement phoneNumber =  driver.findElement(By.xpath("//input[@id = 'contactpoint_step_input']"));
       phoneNumber.sendKeys("3475219635");
        WebElement nextButton2 = driver.findElement(By.xpath("//button[@type = 'submit']"));
        nextButton2.click();
        Thread.sleep(2000);

        //gender
        WebElement gender = driver.findElement(By.xpath("//input[@id ='Female']"));
         gender.click();
         WebElement submitButton4 = driver.findElement(By.xpath("//button[@type= 'submit']"));
         submitButton4.click();
         WebElement newPassword = driver.findElement(By.xpath("//input[@spellcheck = 'false']"));
         newPassword.sendKeys("absD234*");

         //sign-up button
        WebElement signUp = driver.findElement(By.xpath("//button[@value = 'Sign Up']"));
        signUp.click();

        //WebElement nextButton3 = driver.findElement(By.xpath("//input[@name= 'reg_email__']"));
        //nextButton3.click();
        Thread.sleep(2000);
        driver.quit();

    }

}

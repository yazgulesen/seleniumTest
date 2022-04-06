package class2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HW1 {
    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //navigate to
        driver.get(" https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        // fill out the form
        driver.findElement(By.id("customer.firstName")).sendKeys("Gowher");
        driver.findElement(By.id("customer.lastName")).sendKeys("Esen");
        driver.findElement(By.id("customer.address.street")).sendKeys("34 E newtown pl");
        driver.findElement(By.id("customer.address.city")).sendKeys("Newark");
        driver.findElement(By.id("customer.address.state")).sendKeys("New york");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11229");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("12345678");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456");
        driver.findElement(By.id("customer.username")).sendKeys("gowheresen");
        driver.findElement(By.id("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
        //click on register
        driver.findElement(By.className("button")).click();
        //close the browser
        driver.close();}}

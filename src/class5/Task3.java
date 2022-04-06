package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task3 {
    //verify the header
    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //Go to ebay.com
        driver.get(url);

        //get all the categories and print them in the console
        WebElement categories = driver.findElement(By.cssSelector("select[id= 'gh-cat'"));
        Select select = new Select(categories);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        //select Computers/Tables & Networking
        select.selectByValue("58058");
        Thread.sleep(2000);
        //click on search
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
        //verify the header
        /*WebElement header = driver.findElement(By.partialLinkText("Computers"));
        if (header.isDisplayed()) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }*/
if(driver.getTitle().equals("select Computers/Tablets & Networking")){
    System.out.println("title is present");
}else{
    System.out.println("title is not present");
}

        Thread.sleep(2000);

        driver.quit();
    }
}
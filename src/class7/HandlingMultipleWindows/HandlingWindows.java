package class7.HandlingMultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingWindows {
    public static String url="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);
        Thread.sleep(2000);
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String> allWindowHandles = driver.getWindowHandles();// we use Sets do not accept duplicate and handles Id unique everytime
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();//iterating manually not using loop

        mainPageHandle = it.next();//take first step
        String childHandle = it.next();//take second step
        System.out.println(childHandle);
        Thread.sleep(2000);
        //driver.switchTo().window( mainPageHandle);//switch back to mainHandle
        driver.close();//so you switch to the window that you want to close


        driver.quit();//main window closed//you can open a hundred windows until you switch to desired tabs

    }
}

package class7.HandlingMultipleWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        System.out.println(mainPageHandle);
        //click on buttons and open new tabs
        //switch to windows and perform different actions
        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();
        fbButton.click();
        igAndButton.click();

        Set<String> allWindowHandles = driver.getWindowHandles();//store the handles in set
        System.out.println(allWindowHandles.size());
        Iterator<String> it = allWindowHandles.iterator();// get each and every windows title and print them in the console
        while (it.hasNext()) {
            String handle = it.next();
            if (!mainPageHandle.equals(handle)) {  // close the childTabs
                driver.switchTo().window(handle);
                //driver.manage().window().maximize(); //maximize to get the tabs
                String title = driver.getTitle();
                System.out.println(title);
                driver.close();
            }
            driver.switchTo().window(mainPageHandle);//switching back to parent
             igButton.click();//opening new tab again
        }
    }
}
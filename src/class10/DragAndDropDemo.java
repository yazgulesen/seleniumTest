package class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static String url="https://jqueryui.com/droppable/";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.switchTo().frame(0);// since dropdown in iframe we need to switch to frame
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        //actions.dragAndDrop(draggable,droppable).perform();
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform();//another way/when we use build() when we have more than one actions
        //when want everything back to default we just refresh the page
        driver.navigate().refresh();
        driver.quit();



    }
}

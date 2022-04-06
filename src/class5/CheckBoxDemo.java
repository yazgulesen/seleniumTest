package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxDemo {

    public static  String url ="https://www.syntaxprojects.com/basic-checkbox-demo.php";// static variable
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.syntaxprojects.com/basic-checkbox-demo.php");
        driver.get(url);//you need static variable inside static method
        List<WebElement> options = driver.findElements(By.cssSelector("input[class ='cb1-element']"));//create the list of elements, in this case 4 checkboxes
        int size = options.size();
        System.out.println(size);
        //if we want click all 4 element we use for loop
        for(WebElement checkbox:options){
            //checkbox.click();
            //String checkboxtext = checkbox.getText();//webelement command, you can get the text if it is available
            String checkboxtext = checkbox.getAttribute("value");
            if(checkboxtext.equals("Option-2")){
                checkbox.click();
                break;
            }
        }
            driver.quit();
    }
}

package class6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlerts {
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
                                    //to handle AuthenticationAlerts  you passing username and password right after https( username:password@)
                                    //need to add “password” and “username” to string url
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
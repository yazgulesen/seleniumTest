package utils;

public class UtilTest {
    public static void main(String[] args) {
        Util.openBrowser("https://www.google.com/");
        Util.closeBrowser();// we can cal directly without creating and obj of the Util class since we made static class and methods
        Util.openBrowser("https://www.google.com/");
        Util.quitBrowser();
    }
}

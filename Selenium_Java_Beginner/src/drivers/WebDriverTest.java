package drivers;

public class WebDriverTest {

    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FireFoxDriver firefox = new FireFoxDriver();
        firefox.get();
        firefox.findElementBy();
    }
}

package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_Navigate {

    // ...Exercise1...
    // Create a new class under Q1 create main method
    public static void main(String[] args) {
        // Set Path
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        // Create chrome driver
        WebDriver driver= new ChromeDriver();
        // Maximize the window
        driver.manage().window().maximize();
        // Open google home page https://www.google.com/.
        driver.get("https://www.google.com/");
        // On the same class, Navigate to amazon home page https://www.amazon.com/ Navigate back to google
        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        // Navigate forward to amazon
        driver.navigate().forward();
        // Refresh the page
        driver.navigate().refresh();
        // Close/Quit the browser
        driver.close();//quit() tum sayfalari kapatir suan elimizde bir sayfa oldugu icin close yeterli
        // And last step : print "all ok" on console
        System.out.println("all ok");
    }





}

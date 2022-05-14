package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        System.out.println(driver.getWindowHandle());
        //CDwindow-5FAC746BD34C8B6DCACFD9AFF8D5F3B8 benzersiz olarak acilan windowa ait hashcode'unu verir
        driver.close();

    }
}

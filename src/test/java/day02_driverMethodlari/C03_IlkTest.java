package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C03_IlkTest {
    public static void main(String[] args) {
        /*  1-https://www.amazon.com url'ine gidin
            2-Basligin Amazon kelimesi icerdigini test edin
            3-Url'nin "https://www.amazon.com" a esit oldugunu test edin
            4-sayfayi kapatin
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //1-https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");
        //            2-Basligin Amazon kelimesi icerdigini test edin
        String actualtitle= driver.getTitle();
        String arananKelime= "Amazon";
        if (actualtitle.contains(arananKelime)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title "+arananKelime+"'yi icermiyor, title testi FAILED");
        }
        //            3-Url'nin "https://www.amazon.com" a esit oldugunu test edin
        String actualurl= driver.getCurrentUrl();
        String expectedurl= "https://www.amazon.com/";
        if (actualurl.equals(expectedurl)){
            System.out.println("Url testi PASSED");
        }else {
            System.out.println("actual Url:"+actualurl+", url testi FAILED");
        }
        //            4-sayfayi kapatin
        driver.close();
    }
}

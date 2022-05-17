package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q06 {
          /*
    // ...Exercise6...
    1.  https://id.heroku.com/login sayfasina gidin
    2.  Bir mail adersi giriniz
    3.  Bir password giriniz
    4.  Login butonuna tiklayiniz
    5.  "There was a problem with your login." texti gorunur ise
    6.  "kayit yapilamadi" yazdiriniz
    8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
    9.  Tum sayfalari kapatiniz
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    1.  https://id.heroku.com/login sayfasina gidin
        driver.get("https://id.heroku.com/login");
        //    2.  Bir mail adersi giriniz
        WebElement mailKutusu= driver.findElement(By.xpath("//input[@id='email']"));
        mailKutusu.sendKeys("cdasgvdhj@gmail.com");
        //    3.  Bir password giriniz
        WebElement passwordKutusu= driver.findElement(By.xpath("//input[@id='password']"));
        passwordKutusu.sendKeys("1645"+ Keys.ENTER);
        //    4.  Login butonuna tiklayiniz
        driver.findElement(By.name("commit")).click();
        //    5.  "There was a problem with your login." texti gorunur ise
        driver.navigate().back();
        WebElement problemYazisi= driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        //    6.  "kayit yapilamadi" yazdiriniz
        if (problemYazisi.isDisplayed()){
            System.out.println("kayit yapilamadi");
        }
        //    8.  eger yazi gorunur degilse "kayit yapildi" yazdiriniz
        else{
            System.out.println("kayit yapildi");
        }
        //    9.  Tum sayfalari kapatiniz

        driver.close();

    }
}

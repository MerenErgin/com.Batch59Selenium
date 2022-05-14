package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodlari {
    /*
    1- amazon.com'a gidip arama kutusunu locate edin
    2- arama kutusunun tagName'inin input oldugunu test edin
    3- arama kutusunun name attribute'unun degerinin  oldugunu test edin
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //    1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //    2- arama kutusunun tagName'inin input oldugunu test edin
        String expextedTagName= "input";
        String actualTagName=aramaKutusu.getTagName();

        if (expextedTagName.equals(actualTagName)){
            System.out.println("TagName testi PASSED");
        }else {
            System.out.println("TagName testi FAILED");
        }
        //    3- arama kutusunun name attribute'unun degerinin field-keyword oldugunu test edin
        String expextedNameDegeri= "field-keyword";
        String actualNameDegeri= aramaKutusu.getAttribute("name");

        if (expextedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attirbute testi PASSED");
        }else {
            System.out.println("name attirbute testi FAILED");
        }

        System.out.println("aramaKutusu konumu: "+aramaKutusu.getLocation());
        System.out.println("aramaKutusu boyut: "+aramaKutusu.getSize());

        driver.close();

        /*
        <input type="text" id="twotabsearchtextbox" value=""
        name="field-keywords" autocomplete="off" placeholder=""
        class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Ara">

        webElementIsmi.getTagName()--> daha once locate ettigimiz bir webelementin tagname'ini dondurur
        webElementIsmi.getAttribute(attributeIsmi)--> daha once locate ettigimiz bir webelementin
                                                        istedigim attribute'nun degerini dondurur
         */

    }
}

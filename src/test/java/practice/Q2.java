package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {

    public static void main(String[] args) {
        //  ...Exercise2...
        //  1-driver olusturalim
        //  2-java class'imiza chromedriver.exe'yi tanitalim
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //  3-driver'in tum ekrani kaplamasini saglayalim
        driver.manage().window().maximize();
        //  4-driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
        //    söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //  5-"sahibinden.com" adresine gidelim
        driver.get("https://www.sahibinden.com");
        //  6-bu web adresinin sayfa basligini(title) ve adres(url)ini alalim
        String sahibindenTitle= driver.getTitle();
        String sahibindenUrl= driver.getCurrentUrl();
        //  7-title ve url'nin "Oto" kelimesinin icerip icermedigini kontrol edelim
        if (sahibindenUrl.contains("Oto") && sahibindenTitle.contains("Oto")){
            System.out.println("Oto yazisi vardir");
        }else{
            System.out.println("Oto yazisi yoktur");
        }
        //  8-Ardindan "gittigidiyor.com" adresine gidelim
        driver.get("https://gittigidiyor.com");
        //  9-bu adresin basligini alalim ve "Sitesi" kelismesini icerip icermedigini
        //    kontrol edelim
        if (driver.getTitle().contains("Sitesi")){
            System.out.println("Baslikta 'Sitesi' kelimesi var");
        }else {
            System.out.println("Baslikta 'Sitesi' kelimesi yok");
        }
        //  10-Bi onceki web sayfamiza geri donelim
        driver.navigate().back();
        //  11-sayfayi yenileyelim
        driver.navigate().refresh();
        //  12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();
        driver.close();
        //  13-En son adim olarak butun sayfalarimizi kapatmis olalim
        driver.quit();
    }


}

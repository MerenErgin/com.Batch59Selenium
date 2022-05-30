package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q05 {

       public static void main(String[] args) {
           // ...Exercise5...
           System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
           WebDriver driver= new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
           // Navigate to website  https://testpages.herokuapp.com/styled/index.html
           driver.get("https://testpages.herokuapp.com/styled/index.html");
           // Under the  ORIGINAL CONTENTS
           // click on Alerts
           // print the URL
           // navigate back
           // print the URL
           // Click on Basic Ajax
           // print the URL
           // enter value-> 20 and Enter
           // and then verify Submitted Values is displayed open page
           // close driver
       }


}

package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03 {
    public static void main(String[] args) {
        // ...Exercise3...
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //fill the firstname
        driver.findElement(By.name("firstname")).sendKeys("Eren");

        //fill the firstname
        driver.findElement(By.name("lastname")).sendKeys("Ergin");

        //check the gender
        driver.findElement(By.id("sex-0")).click();

        //check the experience
        driver.findElement(By.id("exp-0")).click();

        //fill the date
        driver.findElement(By.id("datepicker")).sendKeys("2022");

        //choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();

        //choose your continent -> Antartica
        driver.findElement(By.xpath("//option[.='Antartica']")).click();

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//option[text()='Browser Commands']")).click();

        //click submit button
        driver.findElement(By.xpath("//button[@name='submit']")).click();
    }
}

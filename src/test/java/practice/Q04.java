package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04 {
    public static void main(String[] args) {
        // ...Exercise4...
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        // Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("20");
        // Type any number in the second input
        driver.findElement(By.id("number2")).sendKeys("30");
        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        // Get the result
        String cevap= driver.findElement(By.id("answer")).getText();
        // Print the result
        System.out.println(cevap);
    }
}

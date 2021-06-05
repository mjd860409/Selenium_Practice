package miscellaneous;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class AlertHandling {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        /*driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
        Alert ae = driver.switchTo().alert();
        System.out.println(ae.getText());
        ae.dismiss();*/

        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hihihfmbzcjsbfj");
        alert.dismiss();
    }
}

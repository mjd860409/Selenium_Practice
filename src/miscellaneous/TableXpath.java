package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableXpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/telecom/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[contains(text(),'Pay Billing')]")).click();
        driver.findElement(By.id("customer_id")).sendKeys("724903");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        //System.out.println(driver.findElement(By.xpath("//tbody/tr[2]/td[4]")).getText());

        List<WebElement> rows = driver.findElements(By.xpath("//tbody/td"));

        for (int i = 0; i<=rows.size(); i++){

            System.out.println(rows.get(i).getText());

        }



    }
}

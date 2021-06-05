import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGuru {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/telecom/index.html");
        driver.manage().window().maximize();
        Thread.sleep(4000);

        driver.findElement(By.linkText("Pay Billing")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("customer_id")).sendKeys("724903");
        Thread.sleep(4000);
        driver.findElement(By.name("submit")).click();

        driver.close();
    }
}

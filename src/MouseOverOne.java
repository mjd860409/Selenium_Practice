import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOne {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='nav-text']")).click();
    }
}

package miscellaneous;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AmazonScrolling {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver,10).until(ExpectedConditions.alertIsPresent());

        driver.get("https://www.amazon.in/");

        JavascriptExecutor js = ((JavascriptExecutor)driver);

        js.executeScript("window.scrollBy(0, 4000)");
    }
}

package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AmazonWindowHandles {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        Actions ac = new Actions(driver);
        ac.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[text()='Amazon Pay']")))
                .click().build().perform();
        ac.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[text()='Gift Cards']"))).click().build().perform();
        ac.keyDown(Keys.CONTROL).moveToElement(driver.findElement(By.xpath("//a[text()='Customer Service'][@class='nav-a  ']")))
                .build().perform();
        ac.keyUp(Keys.CONTROL);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while (it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }

    }
}

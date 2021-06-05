import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class CloseTheMainBrowserWindow {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        String parentId = it.next();
        String childId = it.next();
        for (String windowHandle:windowHandles) {
            driver.switchTo().window(windowHandle);
            if (windowHandle.equals(parentId))
            {
                driver.close();
            }
        }

    }
}

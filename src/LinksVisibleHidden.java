import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksVisibleHidden {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        List<WebElement> linkCount = driver.findElements(By.tagName("a"));
        int count = linkCount.size();
        System.out.println(count);
        int visibleCount = 0;
        int hiddenCount = 0;

        for (WebElement lk:linkCount) {

            if (lk.isDisplayed()){
                visibleCount++;
                }
        }
    }
}

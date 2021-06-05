import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandlesMultipleScenarios {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        int count = windowHandles.size();
        System.out.println("NUmber of browser windows open are::"+count);

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println(windowHandle);
        }
    }
}

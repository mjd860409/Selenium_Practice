package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandlesUsingList {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
        Set<String> windows = driver.getWindowHandles();

        List<String> windows1 = new ArrayList<>(windows);

       /* String parentId = windows1.get(0);
        String childID = windows1.get(1);

        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());

        driver.switchTo().window(childID);
        System.out.println(driver.getTitle());

//        System.out.println(parentId);
//        System.out.println(childID);*/

        for (String winId:windows1) {

           String title = driver.switchTo().window(winId).getTitle();
           System.out.println(title);

        }
    }
}

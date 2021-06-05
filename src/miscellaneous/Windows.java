package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windows {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@class='blinkingText']")).click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> it = windows.iterator();

        String parentID = it.next();

        String childID = it.next();

        driver.switchTo().window(childID);
        Thread.sleep(3000);



//        System.out.println(parentID);
//
//        System.out.println(childID);

    }


}





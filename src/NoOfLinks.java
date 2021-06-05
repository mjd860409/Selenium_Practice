import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NoOfLinks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println(linkList.size());

        for (int i = 0; i<linkList.size(); i++)
        {
            WebElement element = linkList.get(i);

            System.out.println(element);
        }





    }

}

package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintLinkText {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Number of links present::"+list.size());

        for (int i = 0; i< list.size(); i++)
        {
            //System.out.println(list.get(i).getText());

           String linkText = list.get(i).getText();

            System.out.println(linkText);
        }

    }
}
